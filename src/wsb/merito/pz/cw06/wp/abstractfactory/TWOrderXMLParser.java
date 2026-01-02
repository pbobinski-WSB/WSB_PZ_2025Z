package wsb.merito.pz.cw06.wp.abstractfactory;

public class TWOrderXMLParser implements XMLParser{

	@Override
	public String parse() {
		System.out.println("TW Parsing order XML...");
		return "TW Order XML Message";
	}

}

