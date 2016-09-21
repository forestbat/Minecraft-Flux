package szewek.mcflux.wrapper.redstoneflux;

import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.util.EnumFacing;
import szewek.mcflux.api.ex.IEnergy;

class RFSided implements IEnergy {
	private final EnumFacing face;
	private final IEnergyHandler handler;
	private final IEnergyProvider provider;
	private final IEnergyReceiver receiver;

	RFSided(IEnergyHandler h, IEnergyProvider p, IEnergyReceiver r, EnumFacing f) {
		face = f;
		handler = h;
		provider = p;
		receiver = r;
	}

	@Override
	public long getEnergy() {
		return handler.getEnergyStored(face);
	}

	@Override
	public long getEnergyCapacity() {
		return handler.getMaxEnergyStored(face);
	}

	@Override public boolean canInputEnergy() {
		return receiver != null;
	}

	@Override public boolean canOutputEnergy() {
		return provider != null;
	}

	@Override
	public long inputEnergy(long amount, boolean sim) {
		return receiver != null ? receiver.receiveEnergy(face, amount > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) amount, sim) : 0;
	}

	@Override
	public long outputEnergy(long amount, boolean sim) {
		return provider != null ? provider.extractEnergy(face, amount > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) amount, sim) : 0;
	}
}