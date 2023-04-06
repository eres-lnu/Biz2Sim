/**
 */
package pim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interarrival Time Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.InterarrivalTimeDescriptor#getDistributionType <em>Distribution Type</em>}</li>
 *   <li>{@link pim.InterarrivalTimeDescriptor#getDistributionParameters <em>Distribution Parameters</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getInterarrivalTimeDescriptor()
 * @model
 * @generated
 */
public interface InterarrivalTimeDescriptor extends OutputOnlyElement {
	/**
	 * Returns the value of the '<em><b>Distribution Type</b></em>' attribute.
	 * The default value is <code>"Exponential"</code>.
	 * The literals are from the enumeration {@link pim.TimeDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Type</em>' attribute.
	 * @see pim.TimeDistribution
	 * @see #setDistributionType(TimeDistribution)
	 * @see pim.IntermediatePackage#getInterarrivalTimeDescriptor_DistributionType()
	 * @model default="Exponential"
	 * @generated
	 */
	TimeDistribution getDistributionType();

	/**
	 * Sets the value of the '{@link pim.InterarrivalTimeDescriptor#getDistributionType <em>Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Type</em>' attribute.
	 * @see pim.TimeDistribution
	 * @see #getDistributionType()
	 * @generated
	 */
	void setDistributionType(TimeDistribution value);

	/**
	 * Returns the value of the '<em><b>Distribution Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Parameters</em>' attribute list.
	 * @see pim.IntermediatePackage#getInterarrivalTimeDescriptor_DistributionParameters()
	 * @model default="0"
	 * @generated
	 */
	EList<Double> getDistributionParameters();

} // InterarrivalTimeDescriptor
