package com.happy.repository.injection;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.happy.Schedulers;
import com.happy.repository.Repository;
import com.happy.repository.api.ChatApiClient;
import com.happy.repository.api.ChatApiService;
import com.happy.repository.gcm.GcmManager;
import com.happy.repository.db.LocalDatabase;
import com.happy.repository.sharedpreference.SharedPreferenceDb;
import com.happy.repository.sharedpreference.SharedPreferenceDbImpl;
import com.happy.repository.websocket.WebSocketManager;

import io.reactivex.android.schedulers.AndroidSchedulers;

object Injection {

    private Context this.applicationContext;


    public fun bind(Context applicationContext) {
        this.applicationContext = applicationContext;
    }

    public fun providesSchedulers(): Schedulers{
        return Schedulers(AndroidSchedulers.mainThread(), io.reactivex.schedulers.Schedulers.io(), io.reactivex.schedulers.Schedulers.computation());
    }

    public fun providesChatApiService(): ChatApiService {
        return ChatApiClient().getChatApiService();
    }

    public fun providesSharedPreferenceDb() : SharedPreferenceDb {
        return SharedPreferenceDbImpl(this.applicationContext);
    }

    public fun providesWebSocketManager(): WebSocketManager {
        return WebSocketManager();
    }

    public fun providesGcmManager(): GcmManager {
        return GcmManager();

    }

    public fun providesLocalDatabase(): LocalDatabase {
        return Room.databaseBuilder(this.applicationContext, LocalDatabase.class, "chat.db").build();
    }

    public  providesRepository(ChatApiService chatApiService, LocalDatabase localDatabase, SharedPreferenceDb sharedPreferenceDb, Schedulers schedulers): Repository {
        return Repository(chatApiService, localDatabase, sharedPreferenceDb, schedulers);
    }
}
