package des.model_gravelshipping;

import des.core.UniqueEventDescription;

public enum GravelShippingEvents implements UniqueEventDescription
{
	Loading("Loading Truck"),
	LoadingDone("Loading Truck done"),
	Weighing("Weighing Truck"),
	WeighingDone("Weighing Truck done");

	
	String uniqueEventDescription = null;
	
	
	private GravelShippingEvents(String uniqueEventDescription)
	{
		this.uniqueEventDescription = uniqueEventDescription;
	}
	
	
	@Override
	public String get()
	{
		return uniqueEventDescription;
	}

}