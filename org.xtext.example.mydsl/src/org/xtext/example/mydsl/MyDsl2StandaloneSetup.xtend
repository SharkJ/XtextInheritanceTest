/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MyDsl2StandaloneSetup extends MyDsl2StandaloneSetupGenerated {

	def static void doSetup() {
		new MyDsl2StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
