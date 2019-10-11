package com.fahad.bubustracker_user.interfaces;


import com.fahad.bubustracker_user.model.Driver;

public interface FirebaseDriverListener {

    void onDriverAdded(Driver driver);

    void onDriverRemoved(Driver driver);

    void onDriverUpdated(Driver driver);

}
