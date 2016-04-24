package com.fanhl.gitbook.rest.model

import com.google.gson.annotations.SerializedName

/**
 * Created by arkar on 3/9/15.
 */
class LoginParam(@SerializedName("client_secret") var clientSecret: String?,
                 var note: String?)
