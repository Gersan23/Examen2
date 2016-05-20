/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Gersan
 */
public class RegistroEntrenador {
     Entrenador entrenador;

  private ArrayList<Entrenador> array;
  
  public RegistroEntrenador()
  {
    array=new ArrayList<Entrenador>();
  }
  
  public void setObjeto(Entrenador objeto)
  {
    array.add(objeto);
  }
  
  public boolean getExistencia(String codigo)
  {
    boolean existencia=false;
    for(int i=0;i<array.size();i++)
    {
      if(array.get(i).getCodigoDeEntrenador().equalsIgnoreCase(codigo))
      {
        existencia=true;
      }
    }
    return existencia;
  }
  
  public Entrenador getObjeto(String codigo)
  {
    Entrenador objeto=null;
    for(int i=0;i<array.size();i++)
    {
      if(array.get(i).getCodigoDeEntrenador().equalsIgnoreCase(codigo))
      {
        objeto=array.get(i);
      }
    }
    return objeto;
  }
  public Entrenador getObjeto(int i)
  { return array.get(i);
  }
  
  public void eliminar(String codigo)
  {
    for(int i=0;i<array.size();i++)
    {
      if(array.get(i).getCodigoDeEntrenador().equalsIgnoreCase(codigo))
      {
        array.remove(i);
      }
    }
  }
  
  public int getTamano()
  {
    return array.size();
  }
    
}
