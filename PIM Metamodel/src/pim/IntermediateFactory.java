/**
 */
package pim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pim.IntermediatePackage
 * @generated
 */
public interface IntermediateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateFactory eINSTANCE = pim.impl.IntermediateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simulation Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Info</em>'.
	 * @generated
	 */
	SimulationInfo createSimulationInfo();

	/**
	 * Returns a new object of class '<em>Interarrival Time Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interarrival Time Descriptor</em>'.
	 * @generated
	 */
	InterarrivalTimeDescriptor createInterarrivalTimeDescriptor();

	/**
	 * Returns a new object of class '<em>Simple Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Activity</em>'.
	 * @generated
	 */
	SimpleActivity createSimpleActivity();

	/**
	 * Returns a new object of class '<em>End Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Token</em>'.
	 * @generated
	 */
	EndToken createEndToken();

	/**
	 * Returns a new object of class '<em>Multi Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Path</em>'.
	 * @generated
	 */
	MultiPath createMultiPath();

	/**
	 * Returns a new object of class '<em>Path Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Token</em>'.
	 * @generated
	 */
	PathToken createPathToken();

	/**
	 * Returns a new object of class '<em>Resource Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Descriptor</em>'.
	 * @generated
	 */
	ResourceDescriptor createResourceDescriptor();

	/**
	 * Returns a new object of class '<em>Message Send Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Send Activity</em>'.
	 * @generated
	 */
	MessageSendActivity createMessageSendActivity();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Message Receive Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Receive Activity</em>'.
	 * @generated
	 */
	MessageReceiveActivity createMessageReceiveActivity();

	/**
	 * Returns a new object of class '<em>Timer Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Sub Path</em>'.
	 * @generated
	 */
	TimerSubPath createTimerSubPath();

	/**
	 * Returns a new object of class '<em>Signal Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Sub Path</em>'.
	 * @generated
	 */
	SignalSubPath createSignalSubPath();

	/**
	 * Returns a new object of class '<em>Error Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Sub Path</em>'.
	 * @generated
	 */
	ErrorSubPath createErrorSubPath();

	/**
	 * Returns a new object of class '<em>Message Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Sub Path</em>'.
	 * @generated
	 */
	MessageSubPath createMessageSubPath();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediatePackage getIntermediatePackage();

} //IntermediateFactory
