# Stetho no-op [![](https://jitpack.io/v/mypplication/stetho-noop.svg)](https://jitpack.io/#mypplication/stetho-noop)


Simple no-op version of https://github.com/facebook/stetho 


```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
dependencies {
  debugCompile 'com.facebook.stetho:stetho:[LAST_VERSION]'
  releaseCompile 'com.github.mypplication:stetho-noop:1.1'
}
```
