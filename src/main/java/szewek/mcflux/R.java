package szewek.mcflux;

public final class R {
	public static final String
		MF_VERSION = "@VERSION@",
		MF_NAME = "mcflux",
		MF_FULL_NAME = "Minecraft-Flux",
		MF_DEPENDENCIES = "",
		MF_API = "mcfluxAPI",
		MF_API_EX = MF_API + "|ex",
		MF_API_FE = MF_API + "|fe",
		MF_PKG = "szewek.mcflux",
		GUI_FACTORY = MF_PKG + ".client.MCFluxGuiFactory",
		PROXY_SERVER = MF_PKG + ".proxy.ProxyCommon",
		PROXY_CLIENT = MF_PKG + ".proxy.ProxyClient",
		TAG_MF = "@MF",
		WAILA_REGISTER = MF_PKG + ".compat.waila.MCFluxWailaProvider.callbackRegister";

	private R() {}
}
