# ArchitectureStudy

목표 
1. MVVM, Clean Architecture
2. android architecture components 적용
3. Offline mode적용


참고 자료
1. Rocket.Chat.Android(https://github.com/RocketChat/Rocket.Chat.Android) 
2. Plaid(https://github.com/nickbutcher/plaid)
3. Google sunflow (https://github.com/googlesamples/android-sunflower)


순서 
1. Rocket.Chat.Android(https://github.com/RocketChat/Rocket.Chat.Android) 소스를 참고하여 Dagger 사용한 프로젝트 구성해보기
 - dependencies.gradle도 적용 할 것
 




--------

(For Novice)

목표 : PhotoViewer의 구현을 통해 안드로이드 프로젝트를 세팅하고, 중요 라이브러리를 사용할 수 있다.
언어 : kotlin, jetpack
1. Project 세팅 및 스펙에 맞춰 PhotoViewer구현하기
 - 사용라이브러리 : Retrofit2, Glide, OkHttpClient
 - (option) : RxJava2
 - project세팅 : 
   (1) build.gradle에 라이브러리를 추가할 수 있다.
   (2) target sdk, build sdk, min sdk를 설정하고 각각이 의미하는 바가 뭔지 말할 수 있다.
   
2. 구현한 PhotoViewer를 리펙토링 하기
 - Dependency Injection 구현 (라이브러리 사용하지 않음)
   Injection.kt파일 참고하여 singleton객체로 만들어야 할 부분은 Injection class로 만들기

3. RxJava2 사용하기
 - 1번에서 사용하지 않았다면 RxJava사용하여 리펙토링 
 
4. DI툴 사용하기
 - Dagger2 사용하여 DI구현
 
5. Project settings 정보들 파일로 정리하기
 - dependencies.properties
 - keystore.properties
 
6. Navigation Pattern 적용하기
 - Fragments in one Activity

7. MVP패턴으로 리펙토링 해보기

8. MVVM패턴으로 리펙토링 해보기


 
 
