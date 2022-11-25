package com.cnameless.renuevate;

public class Plastic {
    private String name;
    private String acron;
    private String description;
    private int[] imagesResourcesIds;

    public static final Plastic[] plastics = {
            new Plastic("Tereftalato de Polietileno",
                    "PET o PETE",
                    "Es transparente y no transpira. Es uno de los más reciclados, ya que se encuentra en envolturas de plástico, botellas plásticas, envases de alimentos, etcétera. Este tiene un simbolo con el número 1 en el centro",
                    new int[]{R.drawable.plastic_1}
            ),
            new Plastic("Polietileno de Alta Densidad",
                    "HDPE",
                    "Se indica con el número 2 dentro del triángulo de flechas. Se encuentra en productos como los tetrabriks (caja-envoltorio de leche )",
                    new int[]{R.drawable.plastic_2}
            ),
            new Plastic("Policloruro de Vinilo",
                    "PVC",
                    "Se utiliza para hacer tuberías, cables, algunas botellas y garrafas. Resulta ser uno de los plásticos más peligrosos para la salud y el medio ambiente y podrás identificarlo porque su código es el número 3.",
                    new int[]{R.drawable.plastic_3}
            ),

            new Plastic("Polietileno de Baja Densidad",
                    "LDPE",
                    "Está codificado con el número 4. Es un plástico reciclable que se usa en bolsas de congelados, bolsas de basura, papel de cocina transparente o film, botellas de plástico blando, etc.",
                    new int[]{R.drawable.plastic_4}
            ),

            new Plastic("Polipropileno",
                    "PP",
                    "Está muy presente en la construcción y la industria automovilística, pero también en las pajitas para beber y las tapas y los tapones plásticos de algunos envases. Este plástico reciclable se marca con el número 5 dentro del símbolo de flechas.",
                    new int[]{R.drawable.plastic_5}
            ),

            new Plastic("Poliestireno",
                    "PS",
                    "Se marca según el código de reciclaje como el número 6. Como ejemplos, encontramos algunos juguetes, cubiertos, embalajes y corcho blanco (conocido como Unicel o Tecnopor).",
                    new int[]{R.drawable.plastic_6}
            ),

            new Plastic("Otros Plasticos",
                    "O",
                    "Para la categoría del número 7, representada también en esta clasificación de los plásticos con la letra O, es la que engloba el conjunto de plásticos no reciclables. Estos no se pueden reciclar porque suelen ser mezclas de algunos de los anteriormente mencionados o se trata de otros que no son tratables por motivos técnicos.",
                    new int[]{R.drawable.plastic_7}
            )
};

    public Plastic(String name, String acron, String description, int[] imagesResourcesIds) {
        this.name = name;
        this.acron = acron;
        this.description = description;
        this.imagesResourcesIds = imagesResourcesIds;
    }

    public String getName() {
        return name;
    }

    public String getAcron() {
        return acron;
    }

    public String getDescription() {
        return description;
    }

    public int[] getImagesResourcesIds() {
        return imagesResourcesIds;
    }
}