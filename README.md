# BE_Project

## Homebrew 설치하기
-> ```Mac``` 에서 git 설치를 위해 0순위 작업

## git error1
### 1-1) git clone 후 자바 설정
```
git clone https://github.com/crystal397/BE-Project.git
```

```IntelliJ``` 에서 위 명령어로 깃 클론을 한 경우, 자바가 설정되지 않아 생성한 파일에 대해 실행이 되지 않았다.
그래서!!

**File > Project Structure > Project Settings > Project** 의 경로에서 SDK 부분을 설정하면 된다.

### 1-2) git clone 후 모듈 설정(모듈 인식 안 되는 문제)

**File > Project Structure > Modules > + 버튼 > Import module** 의 경로에서 git clone한 파일을 설정하면 된다.

## git error2

```
% git add --all
error: 'Java_Basic/' does not have a commit checked out
```

터미널에서 ```git clone``` 했던 폴더 안에 또 다른 '.git'이 있어서 발생한 문제라고 한다.
그래서!!!

터미널에 ```ls -al``` 명령어로 clone한 파일 안, 만든 파일 안에 '.git'이 있는지 확인해서 있는 경우, 삭제!! 하면 된다.

단,
git clone으로 생성된 파일(```BE_Project/.git```)은 **삭제**하면 안되고,
그 안의 파일(```BE_Project/Java_Basic/.git```)은 **삭제**해야 한다.
