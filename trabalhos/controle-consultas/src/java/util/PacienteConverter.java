package util;
import dao.PacienteDao;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import modelo.Paciente;

@FacesConverter(value = "pacienteConverter", forClass = Paciente.class)
public class PacienteConverter implements Converter {    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        String nome;
        Paciente temp = null;
        PacienteDao dao = new PacienteDao();
        try {
            nome = value;
            temp = dao.buscarPorNome(nome);
	} catch (Exception e) {
            System.out.println("Erro PacienteConverter: "+e.toString());
	} return temp;
    }
    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if (obj == null){
            return " ";
        }
        if (obj instanceof Paciente){
            Paciente paciente = (Paciente)obj;
            return paciente.getNome();
        } else {
            throw new ConverterException(new FacesMessage(obj + " não é um paciente válido"));
        }
    }
}
