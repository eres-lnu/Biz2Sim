/**
 */
package pim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pim.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateFactoryImpl extends EFactoryImpl implements IntermediateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateFactory init() {
		try {
			IntermediateFactory theIntermediateFactory = (IntermediateFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediatePackage.eNS_URI);
			if (theIntermediateFactory != null) {
				return theIntermediateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntermediatePackage.SIMULATION_INFO: return createSimulationInfo();
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR: return createInterarrivalTimeDescriptor();
			case IntermediatePackage.SIMPLE_ACTIVITY: return createSimpleActivity();
			case IntermediatePackage.END_TOKEN: return createEndToken();
			case IntermediatePackage.MULTI_PATH: return createMultiPath();
			case IntermediatePackage.PATH_TOKEN: return createPathToken();
			case IntermediatePackage.RESOURCE_DESCRIPTOR: return createResourceDescriptor();
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY: return createMessageSendActivity();
			case IntermediatePackage.MESSAGE: return createMessage();
			case IntermediatePackage.MESSAGE_RECEIVE_ACTIVITY: return createMessageReceiveActivity();
			case IntermediatePackage.TIMER_SUB_PATH: return createTimerSubPath();
			case IntermediatePackage.SIGNAL_SUB_PATH: return createSignalSubPath();
			case IntermediatePackage.ERROR_SUB_PATH: return createErrorSubPath();
			case IntermediatePackage.MESSAGE_SUB_PATH: return createMessageSubPath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IntermediatePackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			case IntermediatePackage.TIME_DISTRIBUTION:
				return createTimeDistributionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IntermediatePackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			case IntermediatePackage.TIME_DISTRIBUTION:
				return convertTimeDistributionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationInfo createSimulationInfo() {
		SimulationInfoImpl simulationInfo = new SimulationInfoImpl();
		return simulationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterarrivalTimeDescriptor createInterarrivalTimeDescriptor() {
		InterarrivalTimeDescriptorImpl interarrivalTimeDescriptor = new InterarrivalTimeDescriptorImpl();
		return interarrivalTimeDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleActivity createSimpleActivity() {
		SimpleActivityImpl simpleActivity = new SimpleActivityImpl();
		return simpleActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToken createEndToken() {
		EndTokenImpl endToken = new EndTokenImpl();
		return endToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPath createMultiPath() {
		MultiPathImpl multiPath = new MultiPathImpl();
		return multiPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathToken createPathToken() {
		PathTokenImpl pathToken = new PathTokenImpl();
		return pathToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDescriptor createResourceDescriptor() {
		ResourceDescriptorImpl resourceDescriptor = new ResourceDescriptorImpl();
		return resourceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSendActivity createMessageSendActivity() {
		MessageSendActivityImpl messageSendActivity = new MessageSendActivityImpl();
		return messageSendActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageReceiveActivity createMessageReceiveActivity() {
		MessageReceiveActivityImpl messageReceiveActivity = new MessageReceiveActivityImpl();
		return messageReceiveActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerSubPath createTimerSubPath() {
		TimerSubPathImpl timerSubPath = new TimerSubPathImpl();
		return timerSubPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalSubPath createSignalSubPath() {
		SignalSubPathImpl signalSubPath = new SignalSubPathImpl();
		return signalSubPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorSubPath createErrorSubPath() {
		ErrorSubPathImpl errorSubPath = new ErrorSubPathImpl();
		return errorSubPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSubPath createMessageSubPath() {
		MessageSubPathImpl messageSubPath = new MessageSubPathImpl();
		return messageSubPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDistribution createTimeDistributionFromString(EDataType eDataType, String initialValue) {
		TimeDistribution result = TimeDistribution.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDistributionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediatePackage getIntermediatePackage() {
		return (IntermediatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediatePackage getPackage() {
		return IntermediatePackage.eINSTANCE;
	}

} //IntermediateFactoryImpl
