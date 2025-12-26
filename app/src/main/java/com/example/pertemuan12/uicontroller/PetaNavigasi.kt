package com.example.pertemuan12.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pertemuan12.uicontroller.route.DestinasiDetail
import com.example.pertemuan12.uicontroller.route.DestinasiEdit
import com.example.pertemuan12.uicontroller.route.DestinasiEntry
import com.example.pertemuan12.uicontroller.route.DestinasiHome
import com.example.pertemuan12.view.DetailSiswaScreen
import com.example.pertemuan12.view.EditSiswaScreen
import com.example.pertemuan12.view.EntrySiswaScreen
import com.example.pertemuan12.view.HomeScreen

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(), modifier: Modifier){
	HostNavigasi(navController = navController)
}

