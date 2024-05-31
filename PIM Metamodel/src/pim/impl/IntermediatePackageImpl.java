/**
 */
package pim.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pim.Activity;
import pim.Element;
import pim.EndToken;
import pim.ErrorSubPath;
import pim.EventDependentSubPath;
import pim.IOElement;
import pim.InputElement;
import pim.InputOnlyElement;
import pim.InterarrivalTimeDescriptor;
import pim.IntermediateFactory;
import pim.IntermediatePackage;
import pim.LogicalOperator;
import pim.Message;
import pim.MessageReceiveActivity;
import pim.MessageRecipient;
import pim.MessageSendActivity;
import pim.MessageSender;
import pim.MessageSubPath;
import pim.MultiPath;
import pim.OutputElement;
import pim.OutputOnlyElement;
import pim.PathToken;
import pim.ResourceDescriptor;
import pim.SignalSubPath;
import pim.SimpleActivity;
import pim.SimulationInfo;
import pim.TimeDistribution;
import pim.TimerSubPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediatePackageImpl extends EPackageImpl implements IntermediatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOnlyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputOnlyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interarrivalTimeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSendActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageReceiveActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDependentSubPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerSubPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalSubPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorSubPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSubPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageRecipientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeDistributionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pim.IntermediatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediatePackageImpl() {
		super(eNS_URI, IntermediateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IntermediatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediatePackage init() {
		if (isInited) return (IntermediatePackage)EPackage.Registry.INSTANCE.getEPackage(IntermediatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIntermediatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IntermediatePackageImpl theIntermediatePackage = registeredIntermediatePackage instanceof IntermediatePackageImpl ? (IntermediatePackageImpl)registeredIntermediatePackage : new IntermediatePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIntermediatePackage.createPackageContents();

		// Initialize created meta-data
		theIntermediatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediatePackage.eNS_URI, theIntermediatePackage);
		return theIntermediatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputElement() {
		return inputElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputElement() {
		return outputElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputElement_Nextelement() {
		return (EReference)outputElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputOnlyElement() {
		return inputOnlyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOElement() {
		return ioElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputOnlyElement() {
		return outputOnlyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationInfo() {
		return simulationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationInfo_RunTime() {
		return (EAttribute)simulationInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationInfo_Name() {
		return (EAttribute)simulationInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationInfo_Interarrivaltimedescriptor() {
		return (EReference)simulationInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationInfo_MaxEntities() {
		return (EAttribute)simulationInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterarrivalTimeDescriptor() {
		return interarrivalTimeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterarrivalTimeDescriptor_DistributionType() {
		return (EAttribute)interarrivalTimeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterarrivalTimeDescriptor_DistributionParameters() {
		return (EAttribute)interarrivalTimeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleActivity() {
		return simpleActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleActivity_Messagesubpath() {
		return (EReference)simpleActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleActivity_Timersubpath() {
		return (EReference)simpleActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleActivity_Errorsubpath() {
		return (EReference)simpleActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleActivity_Signalsubpath() {
		return (EReference)simpleActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndToken() {
		return endTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPath() {
		return multiPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPath_LogicalOperator() {
		return (EAttribute)multiPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPath_Pathtoken() {
		return (EReference)multiPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathToken() {
		return pathTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_BufferCapacity() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Resourcedescriptor() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDescriptor() {
		return resourceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_ServiceTimeDistributionType() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_ServiceTimeDistributionParameters() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSendActivity() {
		return messageSendActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_DelayDistributionType() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_DelayDistributionParameters() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Messagerecipient() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Messagesender() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageReceiveActivity() {
		return messageReceiveActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDependentSubPath() {
		return eventDependentSubPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventDependentSubPath_Interrupt() {
		return (EAttribute)eventDependentSubPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerSubPath() {
		return timerSubPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerSubPath_TriggerAfterSeconds() {
		return (EAttribute)timerSubPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalSubPath() {
		return signalSubPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorSubPath() {
		return errorSubPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorSubPath_ErrorDescription() {
		return (EAttribute)errorSubPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSubPath() {
		return messageSubPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageRecipient() {
		return messageRecipientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageRecipient_Message() {
		return (EReference)messageRecipientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSender() {
		return messageSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSender_Message() {
		return (EReference)messageSenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeDistribution() {
		return timeDistributionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateFactory getIntermediateFactory() {
		return (IntermediateFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);

		inputElementEClass = createEClass(INPUT_ELEMENT);

		outputElementEClass = createEClass(OUTPUT_ELEMENT);
		createEReference(outputElementEClass, OUTPUT_ELEMENT__NEXTELEMENT);

		inputOnlyElementEClass = createEClass(INPUT_ONLY_ELEMENT);

		ioElementEClass = createEClass(IO_ELEMENT);

		outputOnlyElementEClass = createEClass(OUTPUT_ONLY_ELEMENT);

		simulationInfoEClass = createEClass(SIMULATION_INFO);
		createEAttribute(simulationInfoEClass, SIMULATION_INFO__RUN_TIME);
		createEAttribute(simulationInfoEClass, SIMULATION_INFO__NAME);
		createEReference(simulationInfoEClass, SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR);
		createEAttribute(simulationInfoEClass, SIMULATION_INFO__MAX_ENTITIES);

		interarrivalTimeDescriptorEClass = createEClass(INTERARRIVAL_TIME_DESCRIPTOR);
		createEAttribute(interarrivalTimeDescriptorEClass, INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE);
		createEAttribute(interarrivalTimeDescriptorEClass, INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS);

		simpleActivityEClass = createEClass(SIMPLE_ACTIVITY);
		createEReference(simpleActivityEClass, SIMPLE_ACTIVITY__MESSAGESUBPATH);
		createEReference(simpleActivityEClass, SIMPLE_ACTIVITY__TIMERSUBPATH);
		createEReference(simpleActivityEClass, SIMPLE_ACTIVITY__ERRORSUBPATH);
		createEReference(simpleActivityEClass, SIMPLE_ACTIVITY__SIGNALSUBPATH);

		endTokenEClass = createEClass(END_TOKEN);

		multiPathEClass = createEClass(MULTI_PATH);
		createEAttribute(multiPathEClass, MULTI_PATH__LOGICAL_OPERATOR);
		createEReference(multiPathEClass, MULTI_PATH__PATHTOKEN);

		pathTokenEClass = createEClass(PATH_TOKEN);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__BUFFER_CAPACITY);
		createEReference(activityEClass, ACTIVITY__RESOURCEDESCRIPTOR);

		resourceDescriptorEClass = createEClass(RESOURCE_DESCRIPTOR);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS);

		messageSendActivityEClass = createEClass(MESSAGE_SEND_ACTIVITY);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__DELAY_DISTRIBUTION_TYPE);
		createEAttribute(messageEClass, MESSAGE__DELAY_DISTRIBUTION_PARAMETERS);
		createEReference(messageEClass, MESSAGE__MESSAGERECIPIENT);
		createEReference(messageEClass, MESSAGE__MESSAGESENDER);

		messageReceiveActivityEClass = createEClass(MESSAGE_RECEIVE_ACTIVITY);

		eventDependentSubPathEClass = createEClass(EVENT_DEPENDENT_SUB_PATH);
		createEAttribute(eventDependentSubPathEClass, EVENT_DEPENDENT_SUB_PATH__INTERRUPT);

		timerSubPathEClass = createEClass(TIMER_SUB_PATH);
		createEAttribute(timerSubPathEClass, TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS);

		signalSubPathEClass = createEClass(SIGNAL_SUB_PATH);

		errorSubPathEClass = createEClass(ERROR_SUB_PATH);
		createEAttribute(errorSubPathEClass, ERROR_SUB_PATH__ERROR_DESCRIPTION);

		messageSubPathEClass = createEClass(MESSAGE_SUB_PATH);

		messageRecipientEClass = createEClass(MESSAGE_RECIPIENT);
		createEReference(messageRecipientEClass, MESSAGE_RECIPIENT__MESSAGE);

		messageSenderEClass = createEClass(MESSAGE_SENDER);
		createEReference(messageSenderEClass, MESSAGE_SENDER__MESSAGE);

		// Create enums
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		timeDistributionEEnum = createEEnum(TIME_DISTRIBUTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputElementEClass.getESuperTypes().add(this.getElement());
		outputElementEClass.getESuperTypes().add(this.getElement());
		inputOnlyElementEClass.getESuperTypes().add(this.getInputElement());
		ioElementEClass.getESuperTypes().add(this.getInputElement());
		ioElementEClass.getESuperTypes().add(this.getOutputElement());
		outputOnlyElementEClass.getESuperTypes().add(this.getOutputElement());
		interarrivalTimeDescriptorEClass.getESuperTypes().add(this.getOutputOnlyElement());
		simpleActivityEClass.getESuperTypes().add(this.getActivity());
		endTokenEClass.getESuperTypes().add(this.getInputOnlyElement());
		multiPathEClass.getESuperTypes().add(this.getIOElement());
		pathTokenEClass.getESuperTypes().add(this.getOutputOnlyElement());
		activityEClass.getESuperTypes().add(this.getIOElement());
		messageSendActivityEClass.getESuperTypes().add(this.getActivity());
		messageSendActivityEClass.getESuperTypes().add(this.getMessageSender());
		messageReceiveActivityEClass.getESuperTypes().add(this.getActivity());
		messageReceiveActivityEClass.getESuperTypes().add(this.getMessageRecipient());
		eventDependentSubPathEClass.getESuperTypes().add(this.getOutputOnlyElement());
		timerSubPathEClass.getESuperTypes().add(this.getEventDependentSubPath());
		signalSubPathEClass.getESuperTypes().add(this.getEventDependentSubPath());
		errorSubPathEClass.getESuperTypes().add(this.getEventDependentSubPath());
		messageSubPathEClass.getESuperTypes().add(this.getEventDependentSubPath());
		messageSubPathEClass.getESuperTypes().add(this.getMessageRecipient());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", "defaultName", 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputElementEClass, InputElement.class, "InputElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputElementEClass, OutputElement.class, "OutputElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputElement_Nextelement(), this.getInputElement(), null, "nextelement", null, 1, 1, OutputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputOnlyElementEClass, InputOnlyElement.class, "InputOnlyElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioElementEClass, IOElement.class, "IOElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputOnlyElementEClass, OutputOnlyElement.class, "OutputOnlyElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulationInfoEClass, SimulationInfo.class, "SimulationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulationInfo_RunTime(), ecorePackage.getEDouble(), "runTime", "10.0", 0, 1, SimulationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationInfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimulationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationInfo_Interarrivaltimedescriptor(), this.getInterarrivalTimeDescriptor(), null, "interarrivaltimedescriptor", null, 1, 1, SimulationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationInfo_MaxEntities(), ecorePackage.getEInt(), "maxEntities", "-1", 0, 1, SimulationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interarrivalTimeDescriptorEClass, InterarrivalTimeDescriptor.class, "InterarrivalTimeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterarrivalTimeDescriptor_DistributionType(), this.getTimeDistribution(), "DistributionType", "Exponential", 0, 1, InterarrivalTimeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterarrivalTimeDescriptor_DistributionParameters(), ecorePackage.getEDouble(), "DistributionParameters", "0", 0, -1, InterarrivalTimeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleActivityEClass, SimpleActivity.class, "SimpleActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleActivity_Messagesubpath(), this.getMessageSubPath(), null, "messagesubpath", null, 0, 1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleActivity_Timersubpath(), this.getTimerSubPath(), null, "timersubpath", null, 0, 1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleActivity_Errorsubpath(), this.getErrorSubPath(), null, "errorsubpath", null, 0, 1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleActivity_Signalsubpath(), this.getSignalSubPath(), null, "signalsubpath", null, 0, 1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endTokenEClass, EndToken.class, "EndToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiPathEClass, MultiPath.class, "MultiPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiPath_LogicalOperator(), this.getLogicalOperator(), "logicalOperator", "XOR", 0, 1, MultiPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiPath_Pathtoken(), this.getPathToken(), null, "pathtoken", null, 2, -1, MultiPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathTokenEClass, PathToken.class, "PathToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_BufferCapacity(), ecorePackage.getEDouble(), "bufferCapacity", "25", 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Resourcedescriptor(), this.getResourceDescriptor(), null, "resourcedescriptor", null, 1, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceDescriptorEClass, ResourceDescriptor.class, "ResourceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceDescriptor_ServiceTimeDistributionType(), this.getTimeDistribution(), "serviceTimeDistributionType", "Exponential", 0, 1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDescriptor_ServiceTimeDistributionParameters(), ecorePackage.getEDouble(), "serviceTimeDistributionParameters", "0", 0, -1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSendActivityEClass, MessageSendActivity.class, "MessageSendActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_DelayDistributionType(), this.getTimeDistribution(), "delayDistributionType", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_DelayDistributionParameters(), ecorePackage.getEDouble(), "delayDistributionParameters", "0", 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Messagerecipient(), this.getMessageRecipient(), this.getMessageRecipient_Message(), "messagerecipient", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Messagesender(), this.getMessageSender(), this.getMessageSender_Message(), "messagesender", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageReceiveActivityEClass, MessageReceiveActivity.class, "MessageReceiveActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventDependentSubPathEClass, EventDependentSubPath.class, "EventDependentSubPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventDependentSubPath_Interrupt(), ecorePackage.getEBoolean(), "Interrupt", null, 0, 1, EventDependentSubPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerSubPathEClass, TimerSubPath.class, "TimerSubPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimerSubPath_TriggerAfterSeconds(), ecorePackage.getEDouble(), "triggerAfterSeconds", null, 0, 1, TimerSubPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalSubPathEClass, SignalSubPath.class, "SignalSubPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorSubPathEClass, ErrorSubPath.class, "ErrorSubPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorSubPath_ErrorDescription(), ecorePackage.getEString(), "errorDescription", null, 0, 1, ErrorSubPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSubPathEClass, MessageSubPath.class, "MessageSubPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageRecipientEClass, MessageRecipient.class, "MessageRecipient", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageRecipient_Message(), this.getMessage(), this.getMessage_Messagerecipient(), "message", null, 1, 1, MessageRecipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSenderEClass, MessageSender.class, "MessageSender", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageSender_Message(), this.getMessage(), this.getMessage_Messagesender(), "message", null, 1, 1, MessageSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XOR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);

		initEEnum(timeDistributionEEnum, TimeDistribution.class, "TimeDistribution");
		addEEnumLiteral(timeDistributionEEnum, TimeDistribution.EXPONENTIAL);
		addEEnumLiteral(timeDistributionEEnum, TimeDistribution.NORMAL);
		addEEnumLiteral(timeDistributionEEnum, TimeDistribution.CONSTANT);
		addEEnumLiteral(timeDistributionEEnum, TimeDistribution.WEIBULL);

		// Create resource
		createResource(eNS_URI);
	}

} //IntermediatePackageImpl
