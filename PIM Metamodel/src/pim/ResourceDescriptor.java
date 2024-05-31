/**
 */
package pim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.ResourceDescriptor#getServiceTimeDistributionType <em>Service Time Distribution Type</em>}</li>
 *   <li>{@link pim.ResourceDescriptor#getServiceTimeDistributionParameters <em>Service Time Distribution Parameters</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getResourceDescriptor()
 * @model
 * @generated
 */
public interface ResourceDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Time Distribution Type</b></em>' attribute.
	 * The default value is <code>"Exponential"</code>.
	 * The literals are from the enumeration {@link pim.TimeDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time Distribution Type</em>' attribute.
	 * @see pim.TimeDistribution
	 * @see #setServiceTimeDistributionType(TimeDistribution)
	 * @see pim.IntermediatePackage#getResourceDescriptor_ServiceTimeDistributionType()
	 * @model default="Exponential"
	 * @generated
	 */
	TimeDistribution getServiceTimeDistributionType();

	/**
	 * Sets the value of the '{@link pim.ResourceDescriptor#getServiceTimeDistributionType <em>Service Time Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time Distribution Type</em>' attribute.
	 * @see pim.TimeDistribution
	 * @see #getServiceTimeDistributionType()
	 * @generated
	 */
	void setServiceTimeDistributionType(TimeDistribution value);

	/**
	 * Returns the value of the '<em><b>Service Time Distribution Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time Distribution Parameters</em>' attribute list.
	 * @see pim.IntermediatePackage#getResourceDescriptor_ServiceTimeDistributionParameters()
	 * @model default="0"
	 * @generated
	 */
	EList<Double> getServiceTimeDistributionParameters();

} // ResourceDescriptor
