package org.opencorrelate.exercise.hk2.helloworld;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface HelloWorld {

	void hello(String message);
}
