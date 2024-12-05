package org.d3if4501.mobpro2.ui.screen.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import org.d3if4501.mobpro2s.util.SharedUtil

class AppViewModel : ViewModel() {

    val userFlow = SharedUtil.getUserFlow(viewModelScope)


}