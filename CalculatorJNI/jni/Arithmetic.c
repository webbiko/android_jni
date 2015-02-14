#import <stdio.h>
#import <jni.h>
#import "com_web_android_jni_Arithmetic.h"

JNIEXPORT jdouble JNICALL Java_com_web_android_jni_Arithmetic_add
  (JNIEnv *env, jobject obj, jdouble x, jdouble y) {
	return x + y;
}
