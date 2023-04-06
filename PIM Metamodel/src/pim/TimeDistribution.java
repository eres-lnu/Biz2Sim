/**
 */
package pim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Distribution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pim.IntermediatePackage#getTimeDistribution()
 * @model
 * @generated
 */
public enum TimeDistribution implements Enumerator {
	/**
	 * The '<em><b>Exponential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXPONENTIAL(0, "Exponential", "Exponential"),

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(1, "Normal", "Normal"),

	/**
	 * The '<em><b>Constant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(2, "Constant", "Constant"),

	/**
	 * The '<em><b>Weibull</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIBULL_VALUE
	 * @generated
	 * @ordered
	 */
	WEIBULL(3, "Weibull", "Weibull");

	/**
	 * The '<em><b>Exponential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL
	 * @model name="Exponential"
	 * @generated
	 * @ordered
	 */
	public static final int EXPONENTIAL_VALUE = 0;

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 1;

	/**
	 * The '<em><b>Constant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model name="Constant"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 2;

	/**
	 * The '<em><b>Weibull</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIBULL
	 * @model name="Weibull"
	 * @generated
	 * @ordered
	 */
	public static final int WEIBULL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Time Distribution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeDistribution[] VALUES_ARRAY =
		new TimeDistribution[] {
			EXPONENTIAL,
			NORMAL,
			CONSTANT,
			WEIBULL,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Distribution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeDistribution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Distribution</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeDistribution get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeDistribution result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Distribution</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeDistribution getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeDistribution result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Distribution</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeDistribution get(int value) {
		switch (value) {
			case EXPONENTIAL_VALUE: return EXPONENTIAL;
			case NORMAL_VALUE: return NORMAL;
			case CONSTANT_VALUE: return CONSTANT;
			case WEIBULL_VALUE: return WEIBULL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeDistribution(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeDistribution
