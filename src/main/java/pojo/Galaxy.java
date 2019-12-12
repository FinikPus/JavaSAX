package pojo;

import java.util.ArrayList;

public class Galaxy{
    private String nameGalaxy;
    private String ageGalaxy;
    private String typeGalaxy;

    public Galaxy() {
        System.out.println("Galaxy create!");
    }

    public String getNameGalaxy() {
        return nameGalaxy;
    }

    public void setNameGalaxy(String nameGalaxy) {
        this.nameGalaxy = nameGalaxy;
    }

    public String getAgeGalaxy() {
        return ageGalaxy;
    }

    public void setAgeGalaxy(String ageGalaxy) {
        this.ageGalaxy = ageGalaxy;
    }

    public String getTypeGalaxy() {
        return typeGalaxy;
    }

    public void setTypeGalaxy(String typeGalaxy) {
        this.typeGalaxy = typeGalaxy;
    }

    private ArrayList<PlanetSystem> planetSystems;

    public ArrayList<PlanetSystem> getplanetSystems(){
        return  planetSystems;
    }

    public class PlanetSystem{
        private String namePlanetSystem;

        public PlanetSystem() {
            System.out.println("Planet system create!");
        }

        public String getNamePlanetSystem() {
            return namePlanetSystem;
        }

        public void setNamePlanetSystem(String namePlanetSystem) {
            this.namePlanetSystem = namePlanetSystem;
        }

        private ArrayList<Planet> planets;

        public ArrayList<Planet> getplanets(){
            return  planets;
        }

        private ArrayList<Star> stars;

        public ArrayList<Star> getstars(){
            return  stars;
        }


        private ArrayList<Comet> comets;

        public ArrayList<Comet> getcomets(){
            return  comets;
        }

        public class Planet{
            private String namePlanet;
            private String agePlanet;
            private String typePlanet;

            public Planet() {
                System.out.println("Planet create!");
            }

            public String getNamePlanet() {
                return namePlanet;
            }

            public void setNamePlanet(String namePlanet) {
                this.namePlanet = namePlanet;
            }

            public String getAgePlanet() {
                return agePlanet;
            }

            public void setAgePlanet(String agePlanet) {
                this.agePlanet = agePlanet;
            }

            public String getTypePlanet() {
                return typePlanet;
            }

            public void setTypePlanet(String typePlanet) {
                this.typePlanet = typePlanet;
            }

            private ArrayList<Sputnik> sputniks;

            public ArrayList<Sputnik> getsputniks(){
                return  sputniks;
            }

            public class Sputnik{
                private String nameSputnik;
                private String ageSputnik;

                public Sputnik() {
                    System.out.println("Sputnik create!");
                }

                public String getNameSputnik() {
                    return nameSputnik;
                }

                public void setNameSputnik(String nameSputnik) {
                    this.nameSputnik = nameSputnik;
                }

                public String getAgeSputnik() {
                    return ageSputnik;
                }

                public void setAgeSputnik(String ageSputnik) {
                    this.ageSputnik = ageSputnik;
                }
            }
        }

        public class Star{
            private String nameStar;
            private String classStar;
            private String ageStar;

            public Star() {
                System.out.println("Star create!");
            }

            public String getNameStar() {
                return nameStar;
            }

            public void setNameStar(String nameStar) {
                this.nameStar = nameStar;
            }

            public String getClassStar() {
                return classStar;
            }

            public void setClassStar(String classStar) {
                this.classStar = classStar;
            }

            public String getAgeStar() {
                return ageStar;
            }

            public void setAgeStar(String ageStar) {
                this.ageStar = ageStar;
            }
        }

        public class Comet{
            private String nameComet;
            private String prefix;

            public Comet() {
                System.out.println("Comet create!");
            }

            public String getNameComet() {
                return nameComet;
            }

            public void setNameComet(String nameComet) {
                this.nameComet = nameComet;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }
        }

    }
}


