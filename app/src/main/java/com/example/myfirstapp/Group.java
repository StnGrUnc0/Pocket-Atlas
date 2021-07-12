package com.example.myfirstapp;

import java.util.Comparator;

class Group
{
    private String id;
    private String name;
    private int image;

    private String familyGroupCode;
    private String familyGroupName;

    private String codeValue;
    private String r_ascValue;
    private String declensionValue;
    private String areaValue;
    private String latitudeValue;
    private String meteorshowersValue;
    private String starsValue;
    private String neighbourValue;
    private String majorStarsValue;
    private String historyValue;

    public Group(String id, String name, int image, String familyGroupCode, String familyGroupName, String codeValue, String r_ascValue,
                 String declensionValue, String areaValue, String latitudeValue, String meteorshowersValue, String starsValue,
                 String neighbourValue, String majorStarsValue, String historyValue) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.familyGroupCode = familyGroupCode;
        this.familyGroupName = familyGroupName;

        this.codeValue = codeValue;
        this.r_ascValue = r_ascValue;
        this.declensionValue = declensionValue;
        this.areaValue = areaValue;
        this.latitudeValue = latitudeValue;
        this.meteorshowersValue = meteorshowersValue;
        this.starsValue = starsValue;
        this.neighbourValue = neighbourValue;
        this.majorStarsValue = majorStarsValue;
        this.historyValue = historyValue;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }

    public String getFamilyGroupCode() {
        return familyGroupCode;
    }
    public void setFamilyGroupCode(String name) {
        this.familyGroupCode = familyGroupCode;
    }
    public String getFamilyGroupName() {
        return familyGroupName;
    }
    public void setFamilyGroupName(String name) {
        this.familyGroupName = familyGroupName;
    }


    public String getCodeValue() {
        return codeValue;
    }
    public void setCodeValue(String name) {
        this.codeValue = codeValue;
    }

    public String getR_ascValue() {
        return r_ascValue;
    }
    public void setR_ascValue(String name) {
        this.r_ascValue = r_ascValue;
    }

    public String getDeclensionValue() {
        return declensionValue;
    }
    public void setDeclensionValue(String name) {
        this.declensionValue = declensionValue;
    }

    public String getAreaValue() {
        return areaValue;
    }
    public void setAreaValue(String name) {
        this.areaValue = areaValue;
    }

    public String getLatitudeValue() {
        return latitudeValue;
    }
    public void setLatitudeValue(String name) {
        this.latitudeValue = latitudeValue;
    }

    public String getMeteorshowersValue() {
        return meteorshowersValue;
    }
    public void setMeteorshowersValue(String name) {
        this.meteorshowersValue = meteorshowersValue;
    }

    public String getStarsValue() {
        return starsValue;
    }
    public void setStarsValue(String name) {
        this.starsValue = starsValue;
    }

    public String getNeighbourValue() {
        return neighbourValue;
    }
    public void setNeighbourValue(String name) {
        this.neighbourValue = neighbourValue;
    }

    public String getMajorStarsValue() {
        return majorStarsValue;
    }
    public void setMajorStarsValue(String name) {
        this.majorStarsValue = majorStarsValue;
    }

    public String getHistoryValue() {
        return historyValue;
    }
    public void setHhistoryValue(String name) {
        this.historyValue = historyValue;
    }



    public static Comparator<Group> idAscending = new Comparator<Group>()
    {
        @Override
        public int compare(Group group1, Group group2)
        {
            int id1 = Integer.valueOf(group1.getId());
            int id2 = Integer.valueOf(group2.getId());

            return Integer.compare(id1, id2);
        }
    };

    public static Comparator<Group> nameAscending = new Comparator<Group>()
    {
        @Override
        public int compare(Group group1, Group group2)
        {
            String name1 = group1.getName();
            String name2 = group2.getName();
            name1 = name1.toLowerCase();
            name2 = name2.toLowerCase();

            return name1.compareTo(name2);
        }
    };


}
