#include "JniExample.h"

JNIEXPORT jint JNICALL Java_JniExample_exampleFunction(JNIEnv *env, jobject obj, jint num) {
	return num*num;
}

int main() { return 0; }
