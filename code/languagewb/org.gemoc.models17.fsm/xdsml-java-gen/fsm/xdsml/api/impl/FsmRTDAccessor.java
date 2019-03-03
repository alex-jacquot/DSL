/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package fsm.xdsml.api.impl;
import org.eclipse.emf.ecore.EObject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class FsmRTDAccessor {
  public static java.lang.String getcurrentValues(EObject eObject) {
		return (java.lang.String)  getAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.BufferAspect", "currentValues");
	}
	public static boolean setcurrentValues(EObject eObject, java.lang.String newValue) {
		return setAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.BufferAspect", "currentValues", newValue);
	}
  public static model.State getcurrentState(EObject eObject) {
		return (model.State)  getAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect", "currentState");
	}
	public static boolean setcurrentState(EObject eObject, model.State newValue) {
		return setAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect", "currentState", newValue);
	}
  public static java.lang.String getunderProcessTrigger(EObject eObject) {
		return (java.lang.String)  getAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect", "underProcessTrigger");
	}
	public static boolean setunderProcessTrigger(EObject eObject, java.lang.String newValue) {
		return setAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect", "underProcessTrigger", newValue);
	}
  public static java.lang.String getconsummedString(EObject eObject) {
		return (java.lang.String)  getAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect", "consummedString");
	}
	public static boolean setconsummedString(EObject eObject, java.lang.String newValue) {
		return setAspectProperty(eObject, "org.gemoc.models17.fsm.Fsm", "org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect", "consummedString", newValue);
	}

public static Object getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
			List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
			Class<?> aspect = null;
			for (Class<?> a : aspects) {
				try {
					if (Class.forName(aspectName).isAssignableFrom(a)) {
						aspect = a;
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			if (aspect == null) {
				return null;
			}
			Object res = null;
			 try {
				res = aspect.getDeclaredMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
				if (res != null) {
				return res;
				}else {
					return null;
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
			 return null;
		}
	
	
	public static boolean setAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName, Object newValue) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			}
		}
		if (aspect == null) {
			return false;
		}
			 try {
				 aspect.getMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className(), newValue.getClass()).invoke(eObject, eObject, newValue);
				return true;
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).getClass().getInterfaces()) {
						
						try {
							aspect.getMethod(propertyName, c, newValue.getClass()).invoke(eObject, eObject, newValue);
							return true;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()+"::set"+propertyName);
						}
					}
				}
			return false;
	}
};