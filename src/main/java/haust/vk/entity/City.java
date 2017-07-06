package haust.vk.entity;

import java.io.Serializable;

public class City implements Serializable{

   /**
    * 城市编号
    */
   private Long id;

   /**
    * 城市名称
    */
   private String name;


   public Long getId() {
       return id;
   }

   public void setId(Long id) {
       this.id = id;
   }


   public String getCityName() {
       return name;
   }

   public void setCityName(String cityName) {
       this.name = cityName;
   }

}

