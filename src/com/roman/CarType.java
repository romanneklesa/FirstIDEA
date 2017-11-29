package com.roman;

public enum CarType {
    SEDAN("Lada Granta, Volvo V60, Renault Logan, Lifan Solano", 1.8, 1.6),
    LIMOUSINE("ЗИЛ-41047, Mercedes-Benz W100, Lincoln Town Car", 3.0, 2.9),
    SPORTCAR("Mazda, Mclaren 570GT, Bugatti Vision Gran Turismo, Acura NSX", 5.6, 4.8),
    CROSSOVER("Renault Duster, Chevrolet Niva, Nissan Terrano", 2.0, 1.6),
    HATCHBACK("Skoda Fabia, KIA Ceed, Renault Sandero", 1.6, 1.4);
    private String model;
    private double maxenginecapacity;
    private double minenginecapacity;
    CarType(String model, double maxenginecapacity, double minenginecapacity){
       this.model = model;
       this.maxenginecapacity = maxenginecapacity;
       this.minenginecapacity =  minenginecapacity;
    }
    public String returnModel(){          //получение марок авто
        return model;
    }
public void enginecapacity(){           // метод макимального/минимального объема двигателя

       System.out.println("Максимальный объем двигателя: "+maxenginecapacity+
               "\nМинимальный объем двигателя: " +minenginecapacity);
}
}
