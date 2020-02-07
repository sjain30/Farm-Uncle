package com.ntas.FarmUncle;



public class Foods {

    private String name;

    private String description;

    private int imageresource;



    public static final Foods[] foods = {

            new Foods("Cookies","Small, flat and sweet.", R.drawable.cookies),

            new Foods("Sandwiches","Consisting of vegetables.", R.drawable.sandwich),

            new Foods("Pancakes","Thin and round.", R.drawable.pancakes),

    };



    private Foods(String name, String description, int imageresource)

    {

        this.name=name;

        this.description=description;

        this.imageresource=imageresource;

    }



    public String getName()

    {

        return name;

    }



    public String getDescription()

    {

        return description;

    }



    public int getImageresource()

    {

        return imageresource;

    }



    public String toString()

    {

        return this.name;

    }

}