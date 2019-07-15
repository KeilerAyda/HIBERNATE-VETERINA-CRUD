package entidades;
// Generated 14/07/2019 06:58:19 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Atencion generated by hbm2java
 */
public class Atencion  implements java.io.Serializable {


     private AtencionId id;
     private Clientepormascota clientepormascota;
     private Personal personal;
     private Date fechaAtencion;
     private String diagnostico;
     private Date horaAtencion;

    public Atencion() {
    }

    public Atencion(AtencionId id, Clientepormascota clientepormascota, Personal personal, Date fechaAtencion, String diagnostico, Date horaAtencion) {
       this.id = id;
       this.clientepormascota = clientepormascota;
       this.personal = personal;
       this.fechaAtencion = fechaAtencion;
       this.diagnostico = diagnostico;
       this.horaAtencion = horaAtencion;
    }
   
    public AtencionId getId() {
        return this.id;
    }
    
    public void setId(AtencionId id) {
        this.id = id;
    }
    public Clientepormascota getClientepormascota() {
        return this.clientepormascota;
    }
    
    public void setClientepormascota(Clientepormascota clientepormascota) {
        this.clientepormascota = clientepormascota;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public Date getFechaAtencion() {
        return this.fechaAtencion;
    }
    
    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    public String getDiagnostico() {
        return this.diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public Date getHoraAtencion() {
        return this.horaAtencion;
    }
    
    public void setHoraAtencion(Date horaAtencion) {
        this.horaAtencion = horaAtencion;
    }




}


