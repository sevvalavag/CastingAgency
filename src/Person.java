public class Person {
        private String name;
        private String height; //in cm
        private String eyeColor;
        private String hairColor;

        public Person(String name, String height, String eyeColor, String hairColor) {
            this.name = name;
            this.height = height;
            this.eyeColor = eyeColor;
            this.hairColor = hairColor;
        }
        public String getName() {
            return name;
        }
        public String getHeight() {
            return height;
        }
        public String getEyeColor() {
            return eyeColor;
        }
        public String getHairColor() {
            return hairColor;
        }
    }

