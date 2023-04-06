/**
 */
package pim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pim.IntermediateFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.lnu.pim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediatePackage eINSTANCE = pim.impl.IntermediatePackageImpl.init();

	/**
	 * The meta object id for the '{@link pim.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.Element
	 * @see pim.impl.IntermediatePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pim.InputElement <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.InputElement
	 * @see pim.impl.IntermediatePackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.OutputElement <em>Output Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.OutputElement
	 * @see pim.impl.IntermediatePackageImpl#getOutputElement()
	 * @generated
	 */
	int OUTPUT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__NEXTELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.InputOnlyElement <em>Input Only Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.InputOnlyElement
	 * @see pim.impl.IntermediatePackageImpl#getInputOnlyElement()
	 * @generated
	 */
	int INPUT_ONLY_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ONLY_ELEMENT__NAME = INPUT_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Input Only Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ONLY_ELEMENT_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Only Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ONLY_ELEMENT_OPERATION_COUNT = INPUT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.IOElement <em>IO Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.IOElement
	 * @see pim.impl.IntermediatePackageImpl#getIOElement()
	 * @generated
	 */
	int IO_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ELEMENT__NAME = INPUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ELEMENT__NEXTELEMENT = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ELEMENT_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IO Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_ELEMENT_OPERATION_COUNT = INPUT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.OutputOnlyElement <em>Output Only Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.OutputOnlyElement
	 * @see pim.impl.IntermediatePackageImpl#getOutputOnlyElement()
	 * @generated
	 */
	int OUTPUT_ONLY_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ONLY_ELEMENT__NAME = OUTPUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ONLY_ELEMENT__NEXTELEMENT = OUTPUT_ELEMENT__NEXTELEMENT;

	/**
	 * The number of structural features of the '<em>Output Only Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ONLY_ELEMENT_FEATURE_COUNT = OUTPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Only Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ONLY_ELEMENT_OPERATION_COUNT = OUTPUT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.SimulationInfoImpl <em>Simulation Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.SimulationInfoImpl
	 * @see pim.impl.IntermediatePackageImpl#getSimulationInfo()
	 * @generated
	 */
	int SIMULATION_INFO = 6;

	/**
	 * The feature id for the '<em><b>Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INFO__RUN_TIME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INFO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Interarrivaltimedescriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Max Entities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INFO__MAX_ENTITIES = 3;

	/**
	 * The number of structural features of the '<em>Simulation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Simulation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pim.impl.InterarrivalTimeDescriptorImpl <em>Interarrival Time Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.InterarrivalTimeDescriptorImpl
	 * @see pim.impl.IntermediatePackageImpl#getInterarrivalTimeDescriptor()
	 * @generated
	 */
	int INTERARRIVAL_TIME_DESCRIPTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERARRIVAL_TIME_DESCRIPTOR__NAME = OUTPUT_ONLY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT = OUTPUT_ONLY_ELEMENT__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Distribution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE = OUTPUT_ONLY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distribution Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS = OUTPUT_ONLY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interarrival Time Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERARRIVAL_TIME_DESCRIPTOR_FEATURE_COUNT = OUTPUT_ONLY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interarrival Time Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERARRIVAL_TIME_DESCRIPTOR_OPERATION_COUNT = OUTPUT_ONLY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.Activity <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.Activity
	 * @see pim.impl.IntermediatePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = IO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NEXTELEMENT = IO_ELEMENT__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Buffer Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BUFFER_CAPACITY = IO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resourcedescriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCEDESCRIPTOR = IO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = IO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = IO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.SimpleActivityImpl
	 * @see pim.impl.IntermediatePackageImpl#getSimpleActivity()
	 * @generated
	 */
	int SIMPLE_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__NEXTELEMENT = ACTIVITY__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Buffer Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__BUFFER_CAPACITY = ACTIVITY__BUFFER_CAPACITY;

	/**
	 * The feature id for the '<em><b>Resourcedescriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__RESOURCEDESCRIPTOR = ACTIVITY__RESOURCEDESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Messagesubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__MESSAGESUBPATH = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timersubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__TIMERSUBPATH = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Errorsubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__ERRORSUBPATH = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signalsubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__SIGNALSUBPATH = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Simple Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.EndTokenImpl <em>End Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.EndTokenImpl
	 * @see pim.impl.IntermediatePackageImpl#getEndToken()
	 * @generated
	 */
	int END_TOKEN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TOKEN__NAME = INPUT_ONLY_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>End Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TOKEN_FEATURE_COUNT = INPUT_ONLY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TOKEN_OPERATION_COUNT = INPUT_ONLY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.MultiPathImpl <em>Multi Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.MultiPathImpl
	 * @see pim.impl.IntermediatePackageImpl#getMultiPath()
	 * @generated
	 */
	int MULTI_PATH = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PATH__NAME = IO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PATH__NEXTELEMENT = IO_ELEMENT__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PATH__LOGICAL_OPERATOR = IO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pathtoken</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PATH__PATHTOKEN = IO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PATH_FEATURE_COUNT = IO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PATH_OPERATION_COUNT = IO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.PathTokenImpl <em>Path Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.PathTokenImpl
	 * @see pim.impl.IntermediatePackageImpl#getPathToken()
	 * @generated
	 */
	int PATH_TOKEN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TOKEN__NAME = OUTPUT_ONLY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TOKEN__NEXTELEMENT = OUTPUT_ONLY_ELEMENT__NEXTELEMENT;

	/**
	 * The number of structural features of the '<em>Path Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TOKEN_FEATURE_COUNT = OUTPUT_ONLY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TOKEN_OPERATION_COUNT = OUTPUT_ONLY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.ResourceDescriptorImpl <em>Resource Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.ResourceDescriptorImpl
	 * @see pim.impl.IntermediatePackageImpl#getResourceDescriptor()
	 * @generated
	 */
	int RESOURCE_DESCRIPTOR = 13;

	/**
	 * The feature id for the '<em><b>Service Time Distribution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Service Time Distribution Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Resource Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pim.impl.MessageSendActivityImpl <em>Message Send Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.MessageSendActivityImpl
	 * @see pim.impl.IntermediatePackageImpl#getMessageSendActivity()
	 * @generated
	 */
	int MESSAGE_SEND_ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SEND_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SEND_ACTIVITY__NEXTELEMENT = ACTIVITY__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Buffer Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SEND_ACTIVITY__BUFFER_CAPACITY = ACTIVITY__BUFFER_CAPACITY;

	/**
	 * The feature id for the '<em><b>Resourcedescriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SEND_ACTIVITY__RESOURCEDESCRIPTOR = ACTIVITY__RESOURCEDESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SEND_ACTIVITY__MESSAGE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Send Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SEND_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Send Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SEND_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.MessageImpl
	 * @see pim.impl.IntermediatePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 15;

	/**
	 * The feature id for the '<em><b>Delay Distribution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DELAY_DISTRIBUTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Delay Distribution Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DELAY_DISTRIBUTION_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Messagerecipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGERECIPIENT = 2;

	/**
	 * The feature id for the '<em><b>Messagesender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGESENDER = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pim.impl.MessageReceiveActivityImpl <em>Message Receive Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.MessageReceiveActivityImpl
	 * @see pim.impl.IntermediatePackageImpl#getMessageReceiveActivity()
	 * @generated
	 */
	int MESSAGE_RECEIVE_ACTIVITY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVE_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVE_ACTIVITY__NEXTELEMENT = ACTIVITY__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Buffer Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVE_ACTIVITY__BUFFER_CAPACITY = ACTIVITY__BUFFER_CAPACITY;

	/**
	 * The feature id for the '<em><b>Resourcedescriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVE_ACTIVITY__RESOURCEDESCRIPTOR = ACTIVITY__RESOURCEDESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVE_ACTIVITY__MESSAGE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Receive Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVE_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Receive Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVE_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.EventDependentSubPathImpl <em>Event Dependent Sub Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.EventDependentSubPathImpl
	 * @see pim.impl.IntermediatePackageImpl#getEventDependentSubPath()
	 * @generated
	 */
	int EVENT_DEPENDENT_SUB_PATH = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEPENDENT_SUB_PATH__NAME = OUTPUT_ONLY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT = OUTPUT_ONLY_ELEMENT__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEPENDENT_SUB_PATH__INTERRUPT = OUTPUT_ONLY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Dependent Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT = OUTPUT_ONLY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Dependent Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEPENDENT_SUB_PATH_OPERATION_COUNT = OUTPUT_ONLY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.TimerSubPathImpl <em>Timer Sub Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.TimerSubPathImpl
	 * @see pim.impl.IntermediatePackageImpl#getTimerSubPath()
	 * @generated
	 */
	int TIMER_SUB_PATH = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SUB_PATH__NAME = EVENT_DEPENDENT_SUB_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SUB_PATH__NEXTELEMENT = EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SUB_PATH__INTERRUPT = EVENT_DEPENDENT_SUB_PATH__INTERRUPT;

	/**
	 * The feature id for the '<em><b>Trigger After Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS = EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timer Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SUB_PATH_FEATURE_COUNT = EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timer Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_SUB_PATH_OPERATION_COUNT = EVENT_DEPENDENT_SUB_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.SignalSubPathImpl <em>Signal Sub Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.SignalSubPathImpl
	 * @see pim.impl.IntermediatePackageImpl#getSignalSubPath()
	 * @generated
	 */
	int SIGNAL_SUB_PATH = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SUB_PATH__NAME = EVENT_DEPENDENT_SUB_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SUB_PATH__NEXTELEMENT = EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SUB_PATH__INTERRUPT = EVENT_DEPENDENT_SUB_PATH__INTERRUPT;

	/**
	 * The number of structural features of the '<em>Signal Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SUB_PATH_FEATURE_COUNT = EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SUB_PATH_OPERATION_COUNT = EVENT_DEPENDENT_SUB_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.ErrorSubPathImpl <em>Error Sub Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.ErrorSubPathImpl
	 * @see pim.impl.IntermediatePackageImpl#getErrorSubPath()
	 * @generated
	 */
	int ERROR_SUB_PATH = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SUB_PATH__NAME = EVENT_DEPENDENT_SUB_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SUB_PATH__NEXTELEMENT = EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SUB_PATH__INTERRUPT = EVENT_DEPENDENT_SUB_PATH__INTERRUPT;

	/**
	 * The feature id for the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SUB_PATH__ERROR_DESCRIPTION = EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SUB_PATH_FEATURE_COUNT = EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SUB_PATH_OPERATION_COUNT = EVENT_DEPENDENT_SUB_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.MessageSubPathImpl <em>Message Sub Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.MessageSubPathImpl
	 * @see pim.impl.IntermediatePackageImpl#getMessageSubPath()
	 * @generated
	 */
	int MESSAGE_SUB_PATH = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SUB_PATH__NAME = EVENT_DEPENDENT_SUB_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SUB_PATH__NEXTELEMENT = EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SUB_PATH__INTERRUPT = EVENT_DEPENDENT_SUB_PATH__INTERRUPT;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SUB_PATH__MESSAGE = EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SUB_PATH_FEATURE_COUNT = EVENT_DEPENDENT_SUB_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SUB_PATH_OPERATION_COUNT = EVENT_DEPENDENT_SUB_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pim.impl.MessageRecipientImpl <em>Message Recipient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.MessageRecipientImpl
	 * @see pim.impl.IntermediatePackageImpl#getMessageRecipient()
	 * @generated
	 */
	int MESSAGE_RECIPIENT = 22;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECIPIENT__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Message Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECIPIENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECIPIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pim.impl.MessageSenderImpl <em>Message Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.impl.MessageSenderImpl
	 * @see pim.impl.IntermediatePackageImpl#getMessageSender()
	 * @generated
	 */
	int MESSAGE_SENDER = 23;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENDER__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Message Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SENDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pim.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.LogicalOperator
	 * @see pim.impl.IntermediatePackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 24;

	/**
	 * The meta object id for the '{@link pim.TimeDistribution <em>Time Distribution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pim.TimeDistribution
	 * @see pim.impl.IntermediatePackageImpl#getTimeDistribution()
	 * @generated
	 */
	int TIME_DISTRIBUTION = 25;


	/**
	 * Returns the meta object for class '{@link pim.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see pim.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link pim.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pim.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link pim.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see pim.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for class '{@link pim.OutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Element</em>'.
	 * @see pim.OutputElement
	 * @generated
	 */
	EClass getOutputElement();

	/**
	 * Returns the meta object for the containment reference '{@link pim.OutputElement#getNextelement <em>Nextelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nextelement</em>'.
	 * @see pim.OutputElement#getNextelement()
	 * @see #getOutputElement()
	 * @generated
	 */
	EReference getOutputElement_Nextelement();

	/**
	 * Returns the meta object for class '{@link pim.InputOnlyElement <em>Input Only Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Only Element</em>'.
	 * @see pim.InputOnlyElement
	 * @generated
	 */
	EClass getInputOnlyElement();

	/**
	 * Returns the meta object for class '{@link pim.IOElement <em>IO Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Element</em>'.
	 * @see pim.IOElement
	 * @generated
	 */
	EClass getIOElement();

	/**
	 * Returns the meta object for class '{@link pim.OutputOnlyElement <em>Output Only Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Only Element</em>'.
	 * @see pim.OutputOnlyElement
	 * @generated
	 */
	EClass getOutputOnlyElement();

	/**
	 * Returns the meta object for class '{@link pim.SimulationInfo <em>Simulation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Info</em>'.
	 * @see pim.SimulationInfo
	 * @generated
	 */
	EClass getSimulationInfo();

	/**
	 * Returns the meta object for the attribute '{@link pim.SimulationInfo#getRunTime <em>Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Time</em>'.
	 * @see pim.SimulationInfo#getRunTime()
	 * @see #getSimulationInfo()
	 * @generated
	 */
	EAttribute getSimulationInfo_RunTime();

	/**
	 * Returns the meta object for the attribute '{@link pim.SimulationInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pim.SimulationInfo#getName()
	 * @see #getSimulationInfo()
	 * @generated
	 */
	EAttribute getSimulationInfo_Name();

	/**
	 * Returns the meta object for the containment reference '{@link pim.SimulationInfo#getInterarrivaltimedescriptor <em>Interarrivaltimedescriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interarrivaltimedescriptor</em>'.
	 * @see pim.SimulationInfo#getInterarrivaltimedescriptor()
	 * @see #getSimulationInfo()
	 * @generated
	 */
	EReference getSimulationInfo_Interarrivaltimedescriptor();

	/**
	 * Returns the meta object for the attribute '{@link pim.SimulationInfo#getMaxEntities <em>Max Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Entities</em>'.
	 * @see pim.SimulationInfo#getMaxEntities()
	 * @see #getSimulationInfo()
	 * @generated
	 */
	EAttribute getSimulationInfo_MaxEntities();

	/**
	 * Returns the meta object for class '{@link pim.InterarrivalTimeDescriptor <em>Interarrival Time Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interarrival Time Descriptor</em>'.
	 * @see pim.InterarrivalTimeDescriptor
	 * @generated
	 */
	EClass getInterarrivalTimeDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link pim.InterarrivalTimeDescriptor#getDistributionType <em>Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution Type</em>'.
	 * @see pim.InterarrivalTimeDescriptor#getDistributionType()
	 * @see #getInterarrivalTimeDescriptor()
	 * @generated
	 */
	EAttribute getInterarrivalTimeDescriptor_DistributionType();

	/**
	 * Returns the meta object for the attribute list '{@link pim.InterarrivalTimeDescriptor#getDistributionParameters <em>Distribution Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Distribution Parameters</em>'.
	 * @see pim.InterarrivalTimeDescriptor#getDistributionParameters()
	 * @see #getInterarrivalTimeDescriptor()
	 * @generated
	 */
	EAttribute getInterarrivalTimeDescriptor_DistributionParameters();

	/**
	 * Returns the meta object for class '{@link pim.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Activity</em>'.
	 * @see pim.SimpleActivity
	 * @generated
	 */
	EClass getSimpleActivity();

	/**
	 * Returns the meta object for the containment reference '{@link pim.SimpleActivity#getMessagesubpath <em>Messagesubpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Messagesubpath</em>'.
	 * @see pim.SimpleActivity#getMessagesubpath()
	 * @see #getSimpleActivity()
	 * @generated
	 */
	EReference getSimpleActivity_Messagesubpath();

	/**
	 * Returns the meta object for the containment reference '{@link pim.SimpleActivity#getTimersubpath <em>Timersubpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timersubpath</em>'.
	 * @see pim.SimpleActivity#getTimersubpath()
	 * @see #getSimpleActivity()
	 * @generated
	 */
	EReference getSimpleActivity_Timersubpath();

	/**
	 * Returns the meta object for the containment reference '{@link pim.SimpleActivity#getErrorsubpath <em>Errorsubpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Errorsubpath</em>'.
	 * @see pim.SimpleActivity#getErrorsubpath()
	 * @see #getSimpleActivity()
	 * @generated
	 */
	EReference getSimpleActivity_Errorsubpath();

	/**
	 * Returns the meta object for the containment reference '{@link pim.SimpleActivity#getSignalsubpath <em>Signalsubpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalsubpath</em>'.
	 * @see pim.SimpleActivity#getSignalsubpath()
	 * @see #getSimpleActivity()
	 * @generated
	 */
	EReference getSimpleActivity_Signalsubpath();

	/**
	 * Returns the meta object for class '{@link pim.EndToken <em>End Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Token</em>'.
	 * @see pim.EndToken
	 * @generated
	 */
	EClass getEndToken();

	/**
	 * Returns the meta object for class '{@link pim.MultiPath <em>Multi Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Path</em>'.
	 * @see pim.MultiPath
	 * @generated
	 */
	EClass getMultiPath();

	/**
	 * Returns the meta object for the attribute '{@link pim.MultiPath#getLogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Operator</em>'.
	 * @see pim.MultiPath#getLogicalOperator()
	 * @see #getMultiPath()
	 * @generated
	 */
	EAttribute getMultiPath_LogicalOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link pim.MultiPath#getPathtoken <em>Pathtoken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pathtoken</em>'.
	 * @see pim.MultiPath#getPathtoken()
	 * @see #getMultiPath()
	 * @generated
	 */
	EReference getMultiPath_Pathtoken();

	/**
	 * Returns the meta object for class '{@link pim.PathToken <em>Path Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Token</em>'.
	 * @see pim.PathToken
	 * @generated
	 */
	EClass getPathToken();

	/**
	 * Returns the meta object for class '{@link pim.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see pim.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link pim.Activity#getBufferCapacity <em>Buffer Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Capacity</em>'.
	 * @see pim.Activity#getBufferCapacity()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_BufferCapacity();

	/**
	 * Returns the meta object for the containment reference list '{@link pim.Activity#getResourcedescriptor <em>Resourcedescriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourcedescriptor</em>'.
	 * @see pim.Activity#getResourcedescriptor()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Resourcedescriptor();

	/**
	 * Returns the meta object for class '{@link pim.ResourceDescriptor <em>Resource Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Descriptor</em>'.
	 * @see pim.ResourceDescriptor
	 * @generated
	 */
	EClass getResourceDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link pim.ResourceDescriptor#getServiceTimeDistributionType <em>Service Time Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time Distribution Type</em>'.
	 * @see pim.ResourceDescriptor#getServiceTimeDistributionType()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_ServiceTimeDistributionType();

	/**
	 * Returns the meta object for the attribute list '{@link pim.ResourceDescriptor#getServiceTimeDistributionParameters <em>Service Time Distribution Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Time Distribution Parameters</em>'.
	 * @see pim.ResourceDescriptor#getServiceTimeDistributionParameters()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_ServiceTimeDistributionParameters();

	/**
	 * Returns the meta object for class '{@link pim.MessageSendActivity <em>Message Send Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Send Activity</em>'.
	 * @see pim.MessageSendActivity
	 * @generated
	 */
	EClass getMessageSendActivity();

	/**
	 * Returns the meta object for class '{@link pim.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see pim.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link pim.Message#getDelayDistributionType <em>Delay Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Distribution Type</em>'.
	 * @see pim.Message#getDelayDistributionType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_DelayDistributionType();

	/**
	 * Returns the meta object for the attribute list '{@link pim.Message#getDelayDistributionParameters <em>Delay Distribution Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Delay Distribution Parameters</em>'.
	 * @see pim.Message#getDelayDistributionParameters()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_DelayDistributionParameters();

	/**
	 * Returns the meta object for the reference '{@link pim.Message#getMessagerecipient <em>Messagerecipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Messagerecipient</em>'.
	 * @see pim.Message#getMessagerecipient()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Messagerecipient();

	/**
	 * Returns the meta object for the reference '{@link pim.Message#getMessagesender <em>Messagesender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Messagesender</em>'.
	 * @see pim.Message#getMessagesender()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Messagesender();

	/**
	 * Returns the meta object for class '{@link pim.MessageReceiveActivity <em>Message Receive Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Receive Activity</em>'.
	 * @see pim.MessageReceiveActivity
	 * @generated
	 */
	EClass getMessageReceiveActivity();

	/**
	 * Returns the meta object for class '{@link pim.EventDependentSubPath <em>Event Dependent Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Dependent Sub Path</em>'.
	 * @see pim.EventDependentSubPath
	 * @generated
	 */
	EClass getEventDependentSubPath();

	/**
	 * Returns the meta object for the attribute '{@link pim.EventDependentSubPath#isInterrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupt</em>'.
	 * @see pim.EventDependentSubPath#isInterrupt()
	 * @see #getEventDependentSubPath()
	 * @generated
	 */
	EAttribute getEventDependentSubPath_Interrupt();

	/**
	 * Returns the meta object for class '{@link pim.TimerSubPath <em>Timer Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Sub Path</em>'.
	 * @see pim.TimerSubPath
	 * @generated
	 */
	EClass getTimerSubPath();

	/**
	 * Returns the meta object for the attribute '{@link pim.TimerSubPath#getTriggerAfterSeconds <em>Trigger After Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger After Seconds</em>'.
	 * @see pim.TimerSubPath#getTriggerAfterSeconds()
	 * @see #getTimerSubPath()
	 * @generated
	 */
	EAttribute getTimerSubPath_TriggerAfterSeconds();

	/**
	 * Returns the meta object for class '{@link pim.SignalSubPath <em>Signal Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Sub Path</em>'.
	 * @see pim.SignalSubPath
	 * @generated
	 */
	EClass getSignalSubPath();

	/**
	 * Returns the meta object for class '{@link pim.ErrorSubPath <em>Error Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Sub Path</em>'.
	 * @see pim.ErrorSubPath
	 * @generated
	 */
	EClass getErrorSubPath();

	/**
	 * Returns the meta object for the attribute '{@link pim.ErrorSubPath#getErrorDescription <em>Error Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Description</em>'.
	 * @see pim.ErrorSubPath#getErrorDescription()
	 * @see #getErrorSubPath()
	 * @generated
	 */
	EAttribute getErrorSubPath_ErrorDescription();

	/**
	 * Returns the meta object for class '{@link pim.MessageSubPath <em>Message Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Sub Path</em>'.
	 * @see pim.MessageSubPath
	 * @generated
	 */
	EClass getMessageSubPath();

	/**
	 * Returns the meta object for class '{@link pim.MessageRecipient <em>Message Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Recipient</em>'.
	 * @see pim.MessageRecipient
	 * @generated
	 */
	EClass getMessageRecipient();

	/**
	 * Returns the meta object for the reference '{@link pim.MessageRecipient#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see pim.MessageRecipient#getMessage()
	 * @see #getMessageRecipient()
	 * @generated
	 */
	EReference getMessageRecipient_Message();

	/**
	 * Returns the meta object for class '{@link pim.MessageSender <em>Message Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Sender</em>'.
	 * @see pim.MessageSender
	 * @generated
	 */
	EClass getMessageSender();

	/**
	 * Returns the meta object for the reference '{@link pim.MessageSender#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see pim.MessageSender#getMessage()
	 * @see #getMessageSender()
	 * @generated
	 */
	EReference getMessageSender_Message();

	/**
	 * Returns the meta object for enum '{@link pim.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see pim.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link pim.TimeDistribution <em>Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Distribution</em>'.
	 * @see pim.TimeDistribution
	 * @generated
	 */
	EEnum getTimeDistribution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateFactory getIntermediateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pim.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.Element
		 * @see pim.impl.IntermediatePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link pim.InputElement <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.InputElement
		 * @see pim.impl.IntermediatePackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '{@link pim.OutputElement <em>Output Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.OutputElement
		 * @see pim.impl.IntermediatePackageImpl#getOutputElement()
		 * @generated
		 */
		EClass OUTPUT_ELEMENT = eINSTANCE.getOutputElement();

		/**
		 * The meta object literal for the '<em><b>Nextelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ELEMENT__NEXTELEMENT = eINSTANCE.getOutputElement_Nextelement();

		/**
		 * The meta object literal for the '{@link pim.InputOnlyElement <em>Input Only Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.InputOnlyElement
		 * @see pim.impl.IntermediatePackageImpl#getInputOnlyElement()
		 * @generated
		 */
		EClass INPUT_ONLY_ELEMENT = eINSTANCE.getInputOnlyElement();

		/**
		 * The meta object literal for the '{@link pim.IOElement <em>IO Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.IOElement
		 * @see pim.impl.IntermediatePackageImpl#getIOElement()
		 * @generated
		 */
		EClass IO_ELEMENT = eINSTANCE.getIOElement();

		/**
		 * The meta object literal for the '{@link pim.OutputOnlyElement <em>Output Only Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.OutputOnlyElement
		 * @see pim.impl.IntermediatePackageImpl#getOutputOnlyElement()
		 * @generated
		 */
		EClass OUTPUT_ONLY_ELEMENT = eINSTANCE.getOutputOnlyElement();

		/**
		 * The meta object literal for the '{@link pim.impl.SimulationInfoImpl <em>Simulation Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.SimulationInfoImpl
		 * @see pim.impl.IntermediatePackageImpl#getSimulationInfo()
		 * @generated
		 */
		EClass SIMULATION_INFO = eINSTANCE.getSimulationInfo();

		/**
		 * The meta object literal for the '<em><b>Run Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_INFO__RUN_TIME = eINSTANCE.getSimulationInfo_RunTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_INFO__NAME = eINSTANCE.getSimulationInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Interarrivaltimedescriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR = eINSTANCE.getSimulationInfo_Interarrivaltimedescriptor();

		/**
		 * The meta object literal for the '<em><b>Max Entities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_INFO__MAX_ENTITIES = eINSTANCE.getSimulationInfo_MaxEntities();

		/**
		 * The meta object literal for the '{@link pim.impl.InterarrivalTimeDescriptorImpl <em>Interarrival Time Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.InterarrivalTimeDescriptorImpl
		 * @see pim.impl.IntermediatePackageImpl#getInterarrivalTimeDescriptor()
		 * @generated
		 */
		EClass INTERARRIVAL_TIME_DESCRIPTOR = eINSTANCE.getInterarrivalTimeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Distribution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE = eINSTANCE.getInterarrivalTimeDescriptor_DistributionType();

		/**
		 * The meta object literal for the '<em><b>Distribution Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS = eINSTANCE.getInterarrivalTimeDescriptor_DistributionParameters();

		/**
		 * The meta object literal for the '{@link pim.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.SimpleActivityImpl
		 * @see pim.impl.IntermediatePackageImpl#getSimpleActivity()
		 * @generated
		 */
		EClass SIMPLE_ACTIVITY = eINSTANCE.getSimpleActivity();

		/**
		 * The meta object literal for the '<em><b>Messagesubpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ACTIVITY__MESSAGESUBPATH = eINSTANCE.getSimpleActivity_Messagesubpath();

		/**
		 * The meta object literal for the '<em><b>Timersubpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ACTIVITY__TIMERSUBPATH = eINSTANCE.getSimpleActivity_Timersubpath();

		/**
		 * The meta object literal for the '<em><b>Errorsubpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ACTIVITY__ERRORSUBPATH = eINSTANCE.getSimpleActivity_Errorsubpath();

		/**
		 * The meta object literal for the '<em><b>Signalsubpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ACTIVITY__SIGNALSUBPATH = eINSTANCE.getSimpleActivity_Signalsubpath();

		/**
		 * The meta object literal for the '{@link pim.impl.EndTokenImpl <em>End Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.EndTokenImpl
		 * @see pim.impl.IntermediatePackageImpl#getEndToken()
		 * @generated
		 */
		EClass END_TOKEN = eINSTANCE.getEndToken();

		/**
		 * The meta object literal for the '{@link pim.impl.MultiPathImpl <em>Multi Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.MultiPathImpl
		 * @see pim.impl.IntermediatePackageImpl#getMultiPath()
		 * @generated
		 */
		EClass MULTI_PATH = eINSTANCE.getMultiPath();

		/**
		 * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PATH__LOGICAL_OPERATOR = eINSTANCE.getMultiPath_LogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Pathtoken</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PATH__PATHTOKEN = eINSTANCE.getMultiPath_Pathtoken();

		/**
		 * The meta object literal for the '{@link pim.impl.PathTokenImpl <em>Path Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.PathTokenImpl
		 * @see pim.impl.IntermediatePackageImpl#getPathToken()
		 * @generated
		 */
		EClass PATH_TOKEN = eINSTANCE.getPathToken();

		/**
		 * The meta object literal for the '{@link pim.Activity <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.Activity
		 * @see pim.impl.IntermediatePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Buffer Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__BUFFER_CAPACITY = eINSTANCE.getActivity_BufferCapacity();

		/**
		 * The meta object literal for the '<em><b>Resourcedescriptor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RESOURCEDESCRIPTOR = eINSTANCE.getActivity_Resourcedescriptor();

		/**
		 * The meta object literal for the '{@link pim.impl.ResourceDescriptorImpl <em>Resource Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.ResourceDescriptorImpl
		 * @see pim.impl.IntermediatePackageImpl#getResourceDescriptor()
		 * @generated
		 */
		EClass RESOURCE_DESCRIPTOR = eINSTANCE.getResourceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE = eINSTANCE.getResourceDescriptor_ServiceTimeDistributionType();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS = eINSTANCE.getResourceDescriptor_ServiceTimeDistributionParameters();

		/**
		 * The meta object literal for the '{@link pim.impl.MessageSendActivityImpl <em>Message Send Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.MessageSendActivityImpl
		 * @see pim.impl.IntermediatePackageImpl#getMessageSendActivity()
		 * @generated
		 */
		EClass MESSAGE_SEND_ACTIVITY = eINSTANCE.getMessageSendActivity();

		/**
		 * The meta object literal for the '{@link pim.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.MessageImpl
		 * @see pim.impl.IntermediatePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Delay Distribution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DELAY_DISTRIBUTION_TYPE = eINSTANCE.getMessage_DelayDistributionType();

		/**
		 * The meta object literal for the '<em><b>Delay Distribution Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DELAY_DISTRIBUTION_PARAMETERS = eINSTANCE.getMessage_DelayDistributionParameters();

		/**
		 * The meta object literal for the '<em><b>Messagerecipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MESSAGERECIPIENT = eINSTANCE.getMessage_Messagerecipient();

		/**
		 * The meta object literal for the '<em><b>Messagesender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MESSAGESENDER = eINSTANCE.getMessage_Messagesender();

		/**
		 * The meta object literal for the '{@link pim.impl.MessageReceiveActivityImpl <em>Message Receive Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.MessageReceiveActivityImpl
		 * @see pim.impl.IntermediatePackageImpl#getMessageReceiveActivity()
		 * @generated
		 */
		EClass MESSAGE_RECEIVE_ACTIVITY = eINSTANCE.getMessageReceiveActivity();

		/**
		 * The meta object literal for the '{@link pim.impl.EventDependentSubPathImpl <em>Event Dependent Sub Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.EventDependentSubPathImpl
		 * @see pim.impl.IntermediatePackageImpl#getEventDependentSubPath()
		 * @generated
		 */
		EClass EVENT_DEPENDENT_SUB_PATH = eINSTANCE.getEventDependentSubPath();

		/**
		 * The meta object literal for the '<em><b>Interrupt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_DEPENDENT_SUB_PATH__INTERRUPT = eINSTANCE.getEventDependentSubPath_Interrupt();

		/**
		 * The meta object literal for the '{@link pim.impl.TimerSubPathImpl <em>Timer Sub Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.TimerSubPathImpl
		 * @see pim.impl.IntermediatePackageImpl#getTimerSubPath()
		 * @generated
		 */
		EClass TIMER_SUB_PATH = eINSTANCE.getTimerSubPath();

		/**
		 * The meta object literal for the '<em><b>Trigger After Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS = eINSTANCE.getTimerSubPath_TriggerAfterSeconds();

		/**
		 * The meta object literal for the '{@link pim.impl.SignalSubPathImpl <em>Signal Sub Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.SignalSubPathImpl
		 * @see pim.impl.IntermediatePackageImpl#getSignalSubPath()
		 * @generated
		 */
		EClass SIGNAL_SUB_PATH = eINSTANCE.getSignalSubPath();

		/**
		 * The meta object literal for the '{@link pim.impl.ErrorSubPathImpl <em>Error Sub Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.ErrorSubPathImpl
		 * @see pim.impl.IntermediatePackageImpl#getErrorSubPath()
		 * @generated
		 */
		EClass ERROR_SUB_PATH = eINSTANCE.getErrorSubPath();

		/**
		 * The meta object literal for the '<em><b>Error Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_SUB_PATH__ERROR_DESCRIPTION = eINSTANCE.getErrorSubPath_ErrorDescription();

		/**
		 * The meta object literal for the '{@link pim.impl.MessageSubPathImpl <em>Message Sub Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.MessageSubPathImpl
		 * @see pim.impl.IntermediatePackageImpl#getMessageSubPath()
		 * @generated
		 */
		EClass MESSAGE_SUB_PATH = eINSTANCE.getMessageSubPath();

		/**
		 * The meta object literal for the '{@link pim.impl.MessageRecipientImpl <em>Message Recipient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.MessageRecipientImpl
		 * @see pim.impl.IntermediatePackageImpl#getMessageRecipient()
		 * @generated
		 */
		EClass MESSAGE_RECIPIENT = eINSTANCE.getMessageRecipient();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_RECIPIENT__MESSAGE = eINSTANCE.getMessageRecipient_Message();

		/**
		 * The meta object literal for the '{@link pim.impl.MessageSenderImpl <em>Message Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.impl.MessageSenderImpl
		 * @see pim.impl.IntermediatePackageImpl#getMessageSender()
		 * @generated
		 */
		EClass MESSAGE_SENDER = eINSTANCE.getMessageSender();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_SENDER__MESSAGE = eINSTANCE.getMessageSender_Message();

		/**
		 * The meta object literal for the '{@link pim.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.LogicalOperator
		 * @see pim.impl.IntermediatePackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link pim.TimeDistribution <em>Time Distribution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pim.TimeDistribution
		 * @see pim.impl.IntermediatePackageImpl#getTimeDistribution()
		 * @generated
		 */
		EEnum TIME_DISTRIBUTION = eINSTANCE.getTimeDistribution();

	}

} //IntermediatePackage
