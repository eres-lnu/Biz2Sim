/**
 */
package pim.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pim.IntermediatePackage
 * @generated
 */
public class IntermediateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateSwitch<Adapter> modelSwitch =
		new IntermediateSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseInputElement(InputElement object) {
				return createInputElementAdapter();
			}
			@Override
			public Adapter caseOutputElement(OutputElement object) {
				return createOutputElementAdapter();
			}
			@Override
			public Adapter caseInputOnlyElement(InputOnlyElement object) {
				return createInputOnlyElementAdapter();
			}
			@Override
			public Adapter caseIOElement(IOElement object) {
				return createIOElementAdapter();
			}
			@Override
			public Adapter caseOutputOnlyElement(OutputOnlyElement object) {
				return createOutputOnlyElementAdapter();
			}
			@Override
			public Adapter caseSimulationInfo(SimulationInfo object) {
				return createSimulationInfoAdapter();
			}
			@Override
			public Adapter caseInterarrivalTimeDescriptor(InterarrivalTimeDescriptor object) {
				return createInterarrivalTimeDescriptorAdapter();
			}
			@Override
			public Adapter caseSimpleActivity(SimpleActivity object) {
				return createSimpleActivityAdapter();
			}
			@Override
			public Adapter caseEndToken(EndToken object) {
				return createEndTokenAdapter();
			}
			@Override
			public Adapter caseMultiPath(MultiPath object) {
				return createMultiPathAdapter();
			}
			@Override
			public Adapter casePathToken(PathToken object) {
				return createPathTokenAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseResourceDescriptor(ResourceDescriptor object) {
				return createResourceDescriptorAdapter();
			}
			@Override
			public Adapter caseMessageSendActivity(MessageSendActivity object) {
				return createMessageSendActivityAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseMessageReceiveActivity(MessageReceiveActivity object) {
				return createMessageReceiveActivityAdapter();
			}
			@Override
			public Adapter caseEventDependentSubPath(EventDependentSubPath object) {
				return createEventDependentSubPathAdapter();
			}
			@Override
			public Adapter caseTimerSubPath(TimerSubPath object) {
				return createTimerSubPathAdapter();
			}
			@Override
			public Adapter caseSignalSubPath(SignalSubPath object) {
				return createSignalSubPathAdapter();
			}
			@Override
			public Adapter caseErrorSubPath(ErrorSubPath object) {
				return createErrorSubPathAdapter();
			}
			@Override
			public Adapter caseMessageSubPath(MessageSubPath object) {
				return createMessageSubPathAdapter();
			}
			@Override
			public Adapter caseMessageRecipient(MessageRecipient object) {
				return createMessageRecipientAdapter();
			}
			@Override
			public Adapter caseMessageSender(MessageSender object) {
				return createMessageSenderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pim.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.InputElement
	 * @generated
	 */
	public Adapter createInputElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.OutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.OutputElement
	 * @generated
	 */
	public Adapter createOutputElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.InputOnlyElement <em>Input Only Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.InputOnlyElement
	 * @generated
	 */
	public Adapter createInputOnlyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.IOElement <em>IO Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.IOElement
	 * @generated
	 */
	public Adapter createIOElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.OutputOnlyElement <em>Output Only Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.OutputOnlyElement
	 * @generated
	 */
	public Adapter createOutputOnlyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.SimulationInfo <em>Simulation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.SimulationInfo
	 * @generated
	 */
	public Adapter createSimulationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.InterarrivalTimeDescriptor <em>Interarrival Time Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.InterarrivalTimeDescriptor
	 * @generated
	 */
	public Adapter createInterarrivalTimeDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.SimpleActivity
	 * @generated
	 */
	public Adapter createSimpleActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.EndToken <em>End Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.EndToken
	 * @generated
	 */
	public Adapter createEndTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.MultiPath <em>Multi Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.MultiPath
	 * @generated
	 */
	public Adapter createMultiPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.PathToken <em>Path Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.PathToken
	 * @generated
	 */
	public Adapter createPathTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.ResourceDescriptor <em>Resource Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.ResourceDescriptor
	 * @generated
	 */
	public Adapter createResourceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.MessageSendActivity <em>Message Send Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.MessageSendActivity
	 * @generated
	 */
	public Adapter createMessageSendActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.MessageReceiveActivity <em>Message Receive Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.MessageReceiveActivity
	 * @generated
	 */
	public Adapter createMessageReceiveActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.EventDependentSubPath <em>Event Dependent Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.EventDependentSubPath
	 * @generated
	 */
	public Adapter createEventDependentSubPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.TimerSubPath <em>Timer Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.TimerSubPath
	 * @generated
	 */
	public Adapter createTimerSubPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.SignalSubPath <em>Signal Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.SignalSubPath
	 * @generated
	 */
	public Adapter createSignalSubPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.ErrorSubPath <em>Error Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.ErrorSubPath
	 * @generated
	 */
	public Adapter createErrorSubPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.MessageSubPath <em>Message Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.MessageSubPath
	 * @generated
	 */
	public Adapter createMessageSubPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.MessageRecipient <em>Message Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.MessageRecipient
	 * @generated
	 */
	public Adapter createMessageRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pim.MessageSender <em>Message Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pim.MessageSender
	 * @generated
	 */
	public Adapter createMessageSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntermediateAdapterFactory
