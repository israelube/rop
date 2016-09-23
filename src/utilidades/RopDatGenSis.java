/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

/**
 *
 * @author prof_tes_a
 */
public class RopDatGenSis
{

    private String strNomSis;       //Nombre del Sistema
    private String strVerSis;       //Versión del Sistema
    private String strNomPrg;       //Nombre del programador
    
    /**
     * Crea un objeto con el nombre de Sistema predeterminado "RelojesTES".
     */
    public RopDatGenSis()
    {
        this.strNomSis="RopaTES";
        this.strVerSis="0.1";
        this.strNomPrg="Eddye Lino M.";
    }
    
    /**
     * Obtiene el nombre del Sistema.
     * @return El nombre del Sistema.
     */
    public String getNombreSistema()
    {
        return this.strNomSis;
    }
    
    /**
     * Establece el nombre del Sistema.
     * @param strNom Nombre del Sistema.
     */
    public void setNombreSistema(String strNom)
    {
        this.strNomSis=strNom;
    }
    
    /**
     * Obtiene la versión del Sistema.
     * @return La versión del Sistema.
     */
    public String getVersionSistema()
    {
        return this.strVerSis;
    }
    
    /**
     * Establece la versión del Sistema.
     * @param strVer Versión del Sistema.
     */
    public void setVersionSistema(String strVer)
    {
        this.strVerSis=strVer;
    }
    
    /**
     * Obtiene el nombre del programador del Sistema.
     * @return El nombre del programador del Sistema.
     */
    public String getProgramadorSistema()
    {
        return this.strNomPrg;
    }
    
    /**
     * Establece el nombre del programador del Sistema.
     * @param strPrg Nombre del programador del Sistema.
     */
    public void setProgramadorSistema(String strPrg)
    {
        this.strNomPrg=strPrg;
    }
    
}
