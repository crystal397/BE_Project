# BE_Project

## git error

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
