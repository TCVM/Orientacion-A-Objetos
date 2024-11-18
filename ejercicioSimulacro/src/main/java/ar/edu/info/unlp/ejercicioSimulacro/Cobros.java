package ar.edu.info.unlp.ejercicioSimulacro;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cobros {
	private List<Pago> pagos;
	
	public Cobros() {
		pagos= new ArrayList<>();
	}
	
	public Pagare agregarPagare(double unMonto, String unDestinatario, String unOriginario, LocalDate unaFechaV) {
		Pagare p= new Pagare(unMonto,unDestinatario,unOriginario, unaFechaV);
		pagos.add(p);
		return p;
	}
	
	public Cheque agregarCheque(double unMonto, String unDestinatario, String unOriginario) {
		Cheque q= new Cheque(unMonto,unDestinatario,unOriginario);
		pagos.add(q);
		return q;
	}
	
	public double valorLiquido() {
		return pagos.stream().filter(P->P.agregarCobro()).mapToDouble(p->p.getMonto()).sum();
	}
}
