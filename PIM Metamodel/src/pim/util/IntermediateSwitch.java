/**
 */
package pim.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pim.IntermediatePackage
 * @generated
 */
public class IntermediateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateSwitch() {
		if (modelPackage == null) {
			modelPackage = IntermediatePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntermediatePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.INPUT_ELEMENT: {
				InputElement inputElement = (InputElement)theEObject;
				T result = caseInputElement(inputElement);
				if (result == null) result = caseElement(inputElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.OUTPUT_ELEMENT: {
				OutputElement outputElement = (OutputElement)theEObject;
				T result = caseOutputElement(outputElement);
				if (result == null) result = caseElement(outputElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.INPUT_ONLY_ELEMENT: {
				InputOnlyElement inputOnlyElement = (InputOnlyElement)theEObject;
				T result = caseInputOnlyElement(inputOnlyElement);
				if (result == null) result = caseInputElement(inputOnlyElement);
				if (result == null) result = caseElement(inputOnlyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.IO_ELEMENT: {
				IOElement ioElement = (IOElement)theEObject;
				T result = caseIOElement(ioElement);
				if (result == null) result = caseInputElement(ioElement);
				if (result == null) result = caseOutputElement(ioElement);
				if (result == null) result = caseElement(ioElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.OUTPUT_ONLY_ELEMENT: {
				OutputOnlyElement outputOnlyElement = (OutputOnlyElement)theEObject;
				T result = caseOutputOnlyElement(outputOnlyElement);
				if (result == null) result = caseOutputElement(outputOnlyElement);
				if (result == null) result = caseElement(outputOnlyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.SIMULATION_INFO: {
				SimulationInfo simulationInfo = (SimulationInfo)theEObject;
				T result = caseSimulationInfo(simulationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR: {
				InterarrivalTimeDescriptor interarrivalTimeDescriptor = (InterarrivalTimeDescriptor)theEObject;
				T result = caseInterarrivalTimeDescriptor(interarrivalTimeDescriptor);
				if (result == null) result = caseOutputOnlyElement(interarrivalTimeDescriptor);
				if (result == null) result = caseOutputElement(interarrivalTimeDescriptor);
				if (result == null) result = caseElement(interarrivalTimeDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.SIMPLE_ACTIVITY: {
				SimpleActivity simpleActivity = (SimpleActivity)theEObject;
				T result = caseSimpleActivity(simpleActivity);
				if (result == null) result = caseActivity(simpleActivity);
				if (result == null) result = caseIOElement(simpleActivity);
				if (result == null) result = caseInputElement(simpleActivity);
				if (result == null) result = caseOutputElement(simpleActivity);
				if (result == null) result = caseElement(simpleActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.END_TOKEN: {
				EndToken endToken = (EndToken)theEObject;
				T result = caseEndToken(endToken);
				if (result == null) result = caseInputOnlyElement(endToken);
				if (result == null) result = caseInputElement(endToken);
				if (result == null) result = caseElement(endToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MULTI_PATH: {
				MultiPath multiPath = (MultiPath)theEObject;
				T result = caseMultiPath(multiPath);
				if (result == null) result = caseIOElement(multiPath);
				if (result == null) result = caseInputElement(multiPath);
				if (result == null) result = caseOutputElement(multiPath);
				if (result == null) result = caseElement(multiPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.PATH_TOKEN: {
				PathToken pathToken = (PathToken)theEObject;
				T result = casePathToken(pathToken);
				if (result == null) result = caseOutputOnlyElement(pathToken);
				if (result == null) result = caseOutputElement(pathToken);
				if (result == null) result = caseElement(pathToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseIOElement(activity);
				if (result == null) result = caseInputElement(activity);
				if (result == null) result = caseOutputElement(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.RESOURCE_DESCRIPTOR: {
				ResourceDescriptor resourceDescriptor = (ResourceDescriptor)theEObject;
				T result = caseResourceDescriptor(resourceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY: {
				MessageSendActivity messageSendActivity = (MessageSendActivity)theEObject;
				T result = caseMessageSendActivity(messageSendActivity);
				if (result == null) result = caseActivity(messageSendActivity);
				if (result == null) result = caseMessageSender(messageSendActivity);
				if (result == null) result = caseIOElement(messageSendActivity);
				if (result == null) result = caseInputElement(messageSendActivity);
				if (result == null) result = caseOutputElement(messageSendActivity);
				if (result == null) result = caseElement(messageSendActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MESSAGE_RECEIVE_ACTIVITY: {
				MessageReceiveActivity messageReceiveActivity = (MessageReceiveActivity)theEObject;
				T result = caseMessageReceiveActivity(messageReceiveActivity);
				if (result == null) result = caseActivity(messageReceiveActivity);
				if (result == null) result = caseMessageRecipient(messageReceiveActivity);
				if (result == null) result = caseIOElement(messageReceiveActivity);
				if (result == null) result = caseInputElement(messageReceiveActivity);
				if (result == null) result = caseOutputElement(messageReceiveActivity);
				if (result == null) result = caseElement(messageReceiveActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH: {
				EventDependentSubPath eventDependentSubPath = (EventDependentSubPath)theEObject;
				T result = caseEventDependentSubPath(eventDependentSubPath);
				if (result == null) result = caseOutputOnlyElement(eventDependentSubPath);
				if (result == null) result = caseOutputElement(eventDependentSubPath);
				if (result == null) result = caseElement(eventDependentSubPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.TIMER_SUB_PATH: {
				TimerSubPath timerSubPath = (TimerSubPath)theEObject;
				T result = caseTimerSubPath(timerSubPath);
				if (result == null) result = caseEventDependentSubPath(timerSubPath);
				if (result == null) result = caseOutputOnlyElement(timerSubPath);
				if (result == null) result = caseOutputElement(timerSubPath);
				if (result == null) result = caseElement(timerSubPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.SIGNAL_SUB_PATH: {
				SignalSubPath signalSubPath = (SignalSubPath)theEObject;
				T result = caseSignalSubPath(signalSubPath);
				if (result == null) result = caseEventDependentSubPath(signalSubPath);
				if (result == null) result = caseOutputOnlyElement(signalSubPath);
				if (result == null) result = caseOutputElement(signalSubPath);
				if (result == null) result = caseElement(signalSubPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.ERROR_SUB_PATH: {
				ErrorSubPath errorSubPath = (ErrorSubPath)theEObject;
				T result = caseErrorSubPath(errorSubPath);
				if (result == null) result = caseEventDependentSubPath(errorSubPath);
				if (result == null) result = caseOutputOnlyElement(errorSubPath);
				if (result == null) result = caseOutputElement(errorSubPath);
				if (result == null) result = caseElement(errorSubPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MESSAGE_SUB_PATH: {
				MessageSubPath messageSubPath = (MessageSubPath)theEObject;
				T result = caseMessageSubPath(messageSubPath);
				if (result == null) result = caseEventDependentSubPath(messageSubPath);
				if (result == null) result = caseMessageRecipient(messageSubPath);
				if (result == null) result = caseOutputOnlyElement(messageSubPath);
				if (result == null) result = caseOutputElement(messageSubPath);
				if (result == null) result = caseElement(messageSubPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MESSAGE_RECIPIENT: {
				MessageRecipient messageRecipient = (MessageRecipient)theEObject;
				T result = caseMessageRecipient(messageRecipient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediatePackage.MESSAGE_SENDER: {
				MessageSender messageSender = (MessageSender)theEObject;
				T result = caseMessageSender(messageSender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputElement(InputElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputElement(OutputElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Only Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Only Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOnlyElement(InputOnlyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOElement(IOElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Only Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Only Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputOnlyElement(OutputOnlyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationInfo(SimulationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interarrival Time Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interarrival Time Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterarrivalTimeDescriptor(InterarrivalTimeDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleActivity(SimpleActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndToken(EndToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPath(MultiPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathToken(PathToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDescriptor(ResourceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Send Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Send Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSendActivity(MessageSendActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Receive Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Receive Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageReceiveActivity(MessageReceiveActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Dependent Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Dependent Sub Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDependentSubPath(EventDependentSubPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Sub Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerSubPath(TimerSubPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Sub Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalSubPath(SignalSubPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Sub Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorSubPath(ErrorSubPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Sub Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSubPath(MessageSubPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageRecipient(MessageRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSender(MessageSender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IntermediateSwitch
