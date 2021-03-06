# Android S3 Uploader

Upload the apk of all the build variants to S3, supports Gradle 7

## Installation

Add the following to project's root `build.gradle`

```
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath 'com.latch.android.gradle:plugin:1.1'
  }
}
```

Add the following to the module's `build.gradle` below `android` block

```
apply plugin: "com.latch.android.gradle"
s3 {
    accessKey  = 'AKIA****************'
    secretKey  = 'TPSi************************************'
    bucketName = "apkbuilder"
    keyPrefix  = "path/to/key"                // (Optional) Default: "com.packagename/versionname"
    uploadPath = "app/build/outputs/apk"      // (Optional) Default: "$target.buildDir/outputs/apk"
}
// (Optional but recommended)
uploadApk {
    dependsOn assemble
}
```

## Execution

```
$ ./gradlew uploadApk  # or $ ./gradlew uApk
```

## Reference
https://github.com/rambabusaravanan/gradle-android-s3