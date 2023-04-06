/**
 */
package pim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.Activity#getBufferCapacity <em>Buffer Capacity</em>}</li>
 *   <li>{@link pim.Activity#getResourcedescriptor <em>Resourcedescriptor</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getActivity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Activity extends IOElement {
	/**
	 * Returns the value of the '<em><b>Buffer Capacity</b></em>' attribute.
	 * The default value is <code>"25"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Capacity</em>' attribute.
	 * @see #setBufferCapacity(double)
	 * @see pim.IntermediatePackage#getActivity_BufferCapacity()
	 * @model default="25"
	 * @generated
	 */
	double getBufferCapacity();

	/**
	 * Sets the value of the '{@link pim.Activity#getBufferCapacity <em>Buffer Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Capacity</em>' attribute.
	 * @see #getBufferCapacity()
	 * @generated
	 */
	void setBufferCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Resourcedescriptor</b></em>' containment reference list.
	 * The list contents are of type {@link pim.ResourceDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcedescriptor</em>' containment reference list.
	 * @see pim.IntermediatePackage#getActivity_Resourcedescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceDescriptor> getResourcedescriptor();

} // Activity
