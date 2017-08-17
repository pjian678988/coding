package cn.xplanet.coding.designpattern.behavioral.mediator;

public class UnitedNationsSecurityCouncil extends UnitedNations {
	private USA usaColleague;
	private Iraq iraqColleague;
	
	@Override
	public void declare(String message, Country colleague) {
		if(colleague instanceof USA){
			iraqColleague.getMessage(message);
		}else if(colleague instanceof Iraq){
			usaColleague.getMessage(message);
		}
	}

	public USA getUsaColleague() {
		return usaColleague;
	}

	public void setUsaColleague(USA usaColleague) {
		this.usaColleague = usaColleague;
	}

	public Iraq getIraqColleague() {
		return iraqColleague;
	}

	public void setIraqColleague(Iraq iraqColleague) {
		this.iraqColleague = iraqColleague;
	}

}
