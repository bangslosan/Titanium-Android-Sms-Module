/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package com.hybrid.sms;

import org.appcelerator.kroll.KrollArgument;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.KrollConverter;
import org.appcelerator.kroll.KrollInvocation;
import org.appcelerator.kroll.KrollMethod;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollProxyBinding;
import org.appcelerator.kroll.KrollModuleBinding;
import org.appcelerator.kroll.KrollDynamicProperty;
import org.appcelerator.kroll.KrollReflectionProperty;
import org.appcelerator.kroll.KrollInjector;
import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollDefaultValueProvider;
import org.appcelerator.kroll.util.KrollReflectionUtils;
import org.appcelerator.kroll.util.KrollBindingUtils;
import org.appcelerator.titanium.kroll.KrollBridge;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.util.Log;

import org.mozilla.javascript.Scriptable;

import java.util.HashMap;

import com.hybrid.sms.HybdridsmsModule;


/* WARNING: this code is generated for binding methods in Android */
public class HybdridsmsModuleBindingGen
	extends org.appcelerator.kroll.KrollModuleBindingGen
{
	private static final String TAG = "HybdridsmsModuleBindingGen";

	private static final String DYNPROP_exampleProp = "exampleProp";
	private static final String METHOD_getMessage = "getMessage";
	private static final String METHOD_smsgo = "smsgo";
	private static final String METHOD_example = "example";
		
	public HybdridsmsModuleBindingGen() {
		super();
		// Constants are pre-bound
		
		bindings.put(DYNPROP_exampleProp, null);
		bindings.put(METHOD_getMessage, null);
		bindings.put(METHOD_smsgo, null);
		bindings.put(METHOD_example, null);
		
	}

	public void bindContextSpecific(KrollBridge bridge, KrollProxy proxy) {
	}

	@Override
	public Object getBinding(String name) {
		Object value = bindings.get(name);
		if (value != null) { 
			return value;
		}





		// Dynamic Properties
		if (name.equals(DYNPROP_exampleProp)) {
			KrollDynamicProperty exampleProp_property = new KrollDynamicProperty(DYNPROP_exampleProp,
				true, true,
				true) {
				
				@Override
				public Object dynamicGet(KrollInvocation __invocation) {
	
	final org.appcelerator.kroll.KrollConverter __getExampleProp_converter = org.appcelerator.kroll.KrollConverter.getInstance();
	
	
	java.lang.String __retVal =
	
	
	((HybdridsmsModule) __invocation.getProxy()).getExampleProp(
);
	return __getExampleProp_converter.convertNative(__invocation, __retVal);
				}

				@Override
				public void dynamicSet(KrollInvocation __invocation, Object __value) {
	
		KrollArgument __value_argument = new KrollArgument("value");
		java.lang.String value;
			__value_argument.setOptional(false);
			
				value = (java.lang.String)
					org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __value, java.lang.String.class);
		__value_argument.setValue(value);
		__invocation.addArgument(__value_argument);
	
	
	
	
	((HybdridsmsModule) __invocation.getProxy()).setExampleProp(
		value
		);
				}
			};
			exampleProp_property.setJavascriptConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			exampleProp_property.setNativeConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			bindings.put(DYNPROP_exampleProp, exampleProp_property);
			return exampleProp_property;
		}

		// Methods
		if (name.equals(METHOD_getMessage)) {
			KrollMethod getMessage_method = new KrollMethod(METHOD_getMessage) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	final org.appcelerator.kroll.KrollConverter __getMessage_converter = org.appcelerator.kroll.KrollConverter.getInstance();
	
	
	java.lang.String __retVal =
	
	
	((HybdridsmsModule) __invocation.getProxy()).getMessage(
);
	return __getMessage_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_getMessage, getMessage_method);
			return getMessage_method;
		}
		
		if (name.equals(METHOD_smsgo)) {
			KrollMethod smsgo_method = new KrollMethod(METHOD_smsgo) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 2, METHOD_smsgo);
	final org.appcelerator.kroll.KrollConverter __smsgo_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __phone_argument = new KrollArgument("phone");
		java.lang.String phone;
			__phone_argument.setOptional(false);
			
				phone = (java.lang.String)
					org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.String.class);
		__phone_argument.setValue(phone);
		__invocation.addArgument(__phone_argument);
		KrollArgument __msg_argument = new KrollArgument("msg");
		java.lang.String msg;
			__msg_argument.setOptional(false);
			
				msg = (java.lang.String)
					org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[1], java.lang.String.class);
		__msg_argument.setValue(msg);
		__invocation.addArgument(__msg_argument);
	
	
	java.lang.String __retVal =
	
	
	((HybdridsmsModule) __invocation.getProxy()).smsgo(
		phone,
				msg
		);
	return __smsgo_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_smsgo, smsgo_method);
			return smsgo_method;
		}
		
		if (name.equals(METHOD_example)) {
			KrollMethod example_method = new KrollMethod(METHOD_example) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	final org.appcelerator.kroll.KrollConverter __example_converter = org.appcelerator.kroll.KrollConverter.getInstance();
	
	
	java.lang.String __retVal =
	
	
	((HybdridsmsModule) __invocation.getProxy()).example(
);
	return __example_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_example, example_method);
			return example_method;
		}


		return super.getBinding(name);
	}

	private static final String SHORT_API_NAME = "Hybdridsms";
	private static final String FULL_API_NAME = "Hybdridsms";
	private static final String ID = "com.hybrid.sms";

	public String getAPIName() {
		return FULL_API_NAME;
	}

	public String getShortAPIName() {
		return SHORT_API_NAME;
	}

	public String getId() {
		return ID;
	}

	public KrollModule newInstance(TiContext context) {
		return new HybdridsmsModule(context);
	}

	public Class<? extends KrollProxy> getProxyClass() {
		return HybdridsmsModule.class;
	}

	public boolean isModule() {
		return true; 
	}
}