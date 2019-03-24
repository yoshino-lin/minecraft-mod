package mod.mcreator;

public class ClientProxymcjdmly extends CommonProxymcjdmly {

	@Override
	public void registerRenderers(mcjdmly instance) {
		instance.elements.forEach(element -> element.registerRenderers());
	}
}
