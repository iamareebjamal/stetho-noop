# Stetho no-op
> Simple no-op version of https://github.com/facebook/stetho

[![](https://jitpack.io/v/iamareebjamal/stetho-noop.svg)](https://jitpack.io/#iamareebjamal/stetho-noop)


```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
  debugImplementation 'com.facebook.stetho:stetho:{LATEST_VERSION}'
  releaseImplementation 'com.github.iamareebjamal:stetho-noop:{JITPACK_VERSION}'
}
```
