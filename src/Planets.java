/*B. Back in the Planets enum, add a new field called yearLength.
a. The value of each yearLength should be the number of earth days of a
year on the given planet.
i. Number of earth days on each planet:
i. Mercury: 88
ii. Venus: 225
iii. Earth: 365
iv. Mars: 687
v. Jupiter: 4333
vi. Saturn: 10759
vii. Uranus: 30687
viii. Neptune: 60200

b. Update the constructor and add a getter for this field.

 */
public enum Planets {
    MERCURY(88), VENUS(225), EARTH(365), MARS(687), JUPITER(4333), SATURN(10759), URANUS(30687), NEPTUNE(60200);
    int yearlength;
    Planets(int yearlength){
        this.yearlength = yearlength;
    }
    int getYearLength(){
        return yearlength;
    }
}
