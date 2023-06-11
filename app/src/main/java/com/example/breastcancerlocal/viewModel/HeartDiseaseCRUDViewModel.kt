package com.example.HeartDiseaselocal.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.breastcancerlocal.database.DataBaseManger
import com.example.breastcancerlocal.model.HeartDisease
import com.example.breastcancerlocal.model.HeartDiseaseVO
import java.util.ArrayList

class HeartDiseaseCRUDViewModel constructor(context: Context): ViewModel() {

    private var dbm: DataBaseManger = DataBaseManger (context)
    private var currentHeartDisease: HeartDiseaseVO? = null
    private var currentHeartDiseases: ArrayList<HeartDiseaseVO> = ArrayList()

    companion object {
        private var instance: HeartDiseaseCRUDViewModel? = null
        fun getInstance(context: Context): HeartDiseaseCRUDViewModel {
            return instance ?: HeartDiseaseCRUDViewModel(context)
        }
    }

    fun stringListHeartDisease(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (x in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[x].toString())
        }
        return res
    }

    fun getHeartDiseaseByPK(value: String): HeartDisease? {
        val res: List<HeartDiseaseVO> = dbm.searchByHeartDiseaseid(value)
        return if (res.isEmpty()) {
            null
        } else {
            val vo: HeartDiseaseVO = res[0]
            val itemx = HeartDisease.createByPKHeartDisease(value)
            itemx.id = vo.id
            itemx.age = vo.age
            itemx.sex = vo.sex
            itemx.cp = vo.cp
            itemx.trestbps = vo.trestbps
            itemx.chol = vo.chol
            itemx.fbs = vo.fbs
            itemx.restecg = vo.restecg
            itemx.thalach = vo.thalach
            itemx.exang = vo.exang
            itemx.oldpeak = vo.oldpeak
            itemx.slope = vo.slope
            itemx.ca = vo.ca
            itemx.thal = vo.thal
            itemx.outcome = vo.outcome
            itemx
        }
    }

    fun retrieveHeartDisease(value: String): HeartDisease? {
        return getHeartDiseaseByPK(value)
    }

    fun allHeartDiseaseids(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].id)
        }
        return res
    }

    fun allHeartDiseaseages(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].age.toString())
        }
        return res
    }

    fun allHeartDiseasesexs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].sex.toString())
        }
        return res
    }

    fun allHeartDiseasecps(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].cp.toString())
        }
        return res
    }

    fun allHeartDiseasetrestbpss(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].trestbps.toString())
        }
        return res
    }

    fun allHeartDiseasechols(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].chol.toString())
        }
        return res
    }

    fun allHeartDiseasefbss(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].fbs.toString())
        }
        return res
    }

    fun allHeartDiseaserestecgs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].restecg.toString())
        }
        return res
    }

    fun allHeartDiseasethalachs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].thalach.toString())
        }
        return res
    }

    fun allHeartDiseaseexangs(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].exang.toString())
        }
        return res
    }

    fun allHeartDiseaseoldpeaks(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].oldpeak.toString())
        }
        return res
    }

    fun allHeartDiseaseslopes(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].slope.toString())
        }
        return res
    }

    fun allHeartDiseasecas(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].ca.toString())
        }
        return res
    }

    fun allHeartDiseasethals(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].thal.toString())
        }
        return res
    }

    fun allHeartDiseaseoutcomes(): ArrayList<String> {
        currentHeartDiseases = dbm.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (HeartDisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[HeartDisease].outcome.toString())
        }
        return res
    }

    fun setSelectedHeartDisease(x: HeartDiseaseVO) {
        currentHeartDisease = x
    }

    fun setSelectedMeal(i: Int) {
        if (i < currentHeartDiseases.size) {
            currentHeartDisease = currentHeartDiseases[i]
        }
    }

    fun getSelectedHeartDisease(): HeartDiseaseVO? {
        return currentHeartDisease
    }

    fun persistHeartDisease(x: HeartDisease) {
        val vo = HeartDiseaseVO(x)
        dbm.editHeartDisease(vo)
        currentHeartDisease = vo
    }

    fun listHeartDisease(): ArrayList<HeartDiseaseVO> {
        currentHeartDiseases = dbm.listHeartDisease()
        return currentHeartDiseases
    }

    fun editHeartDisease(x: HeartDiseaseVO) {
        dbm.editHeartDisease(x)
        currentHeartDisease = x
    }

    fun createHeartDisease(x: HeartDiseaseVO) {
        dbm.createHeartDisease(x)
        currentHeartDisease = x
    }

    fun deleteHeartDisease(id: String) {
        dbm.deleteHeartDisease(id)
        currentHeartDisease = null
    }

    fun searchByHeartDiseaseid(idx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseid(idx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseage(agex: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseage(agex)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasesex(sexx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasesex(sexx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasecp(cpx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasecp(cpx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasetrestbps(trestbpsx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasetrestbps(trestbpsx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasechol(cholx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasechol(cholx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasefbs(fbsx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasefbs(fbsx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaserestecg(restecgx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaserestecg(restecgx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseoldpeak(oldpeakx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseoldpeak(oldpeakx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseslope(slopex: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseslope(slopex)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseca(cax: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseca(cax)
        return currentHeartDiseases
    }

    fun searchByHeartDiseasethal(thalx: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseasethal(thalx)
        return currentHeartDiseases
    }

    fun searchByHeartDiseaseoutcome(outcomex: String): List<HeartDiseaseVO> {
        currentHeartDiseases = dbm.searchByHeartDiseaseoutcome(outcomex)
        return currentHeartDiseases
    }

}
