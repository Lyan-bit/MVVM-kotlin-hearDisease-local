package com.example.breastcancerlocal.database

import com.example.breastcancerlocal.model.HeartDiseaseVO
import java.util.ArrayList

interface HeartDiseases {
    fun listHeartDisease(): ArrayList<HeartDiseaseVO>
    fun editHeartDisease(x: HeartDiseaseVO)
    fun createHeartDisease(x: HeartDiseaseVO)
    fun deleteHeartDisease(id: String)
    fun searchByHeartDiseaseid(idx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseaseage(agex: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseasesex(sexx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseasecp(cpx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseasetrestbps(trestbpsx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseasechol(cholx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseasefbs(fbsx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseaserestecg(restecgx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseaseoldpeak(oldpeakx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseaseslope(slopex: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseaseca(cax: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseasethal(thalx: String): ArrayList<HeartDiseaseVO>
    fun searchByHeartDiseaseoutcome(outcomex: String): ArrayList<HeartDiseaseVO>
}