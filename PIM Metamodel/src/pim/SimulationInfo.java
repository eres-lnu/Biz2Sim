/**
 */
package pim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.SimulationInfo#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link pim.SimulationInfo#getName <em>Name</em>}</li>
 *   <li>{@link pim.SimulationInfo#getInterarrivaltimedescriptor <em>Interarrivaltimedescriptor</em>}</li>
 *   <li>{@link pim.SimulationInfo#getMaxEntities <em>Max Entities</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getSimulationInfo()
 * @model
 * @generated
 */
public interface SimulationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Run Time</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Time</em>' attribute.
	 * @see #setRunTime(double)
	 * @see pim.IntermediatePackage#getSimulationInfo_RunTime()
	 * @model default="10.0"
	 * @generated
	 */
	double getRunTime();

	/**
	 * Sets the value of the '{@link pim.SimulationInfo#getRunTime <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Time</em>' attribute.
	 * @see #getRunTime()
	 * @generated
	 */
	void setRunTime(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pim.IntermediatePackage#getSimulationInfo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pim.SimulationInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interarrivaltimedescriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interarrivaltimedescriptor</em>' containment reference.
	 * @see #setInterarrivaltimedescriptor(InterarrivalTimeDescriptor)
	 * @see pim.IntermediatePackage#getSimulationInfo_Interarrivaltimedescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterarrivalTimeDescriptor getInterarrivaltimedescriptor();

	/**
	 * Sets the value of the '{@link pim.SimulationInfo#getInterarrivaltimedescriptor <em>Interarrivaltimedescriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interarrivaltimedescriptor</em>' containment reference.
	 * @see #getInterarrivaltimedescriptor()
	 * @generated
	 */
	void setInterarrivaltimedescriptor(InterarrivalTimeDescriptor value);

	/**
	 * Returns the value of the '<em><b>Max Entities</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Entities</em>' attribute.
	 * @see #setMaxEntities(int)
	 * @see pim.IntermediatePackage#getSimulationInfo_MaxEntities()
	 * @model default="-1"
	 * @generated
	 */
	int getMaxEntities();

	/**
	 * Sets the value of the '{@link pim.SimulationInfo#getMaxEntities <em>Max Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Entities</em>' attribute.
	 * @see #getMaxEntities()
	 * @generated
	 */
	void setMaxEntities(int value);

} // SimulationInfo
