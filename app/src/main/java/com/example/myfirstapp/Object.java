package com.example.myfirstapp;

import java.util.Comparator;

class Object
{
    private String objectId;
    private String objectName;
    private String objectNameM;
    private String objectType;
    private String objectMagn;

    public Object(String objectId, String objectName, String objectNameM, String objectType, String objectMagn) {
        this.objectId = objectId;
        this.objectName = objectName;
        this.objectNameM = objectNameM;
        this.objectType = objectType;
        this.objectMagn = objectMagn;
    }

    public String getObjectId() {
        return objectId;
    }
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectName() {
        return objectName;
    }
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectNameM() {
        return objectNameM;
    }
    public void setObjectNameM(String objectNameM) {
        this.objectNameM = objectNameM;
    }

    public String getObjectType() {
        return objectType;
    }
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectMagn() {
        return objectMagn;
    }
    public void setObjectMagn(String objectMagn) {
        this.objectMagn = objectMagn;
    }
}
