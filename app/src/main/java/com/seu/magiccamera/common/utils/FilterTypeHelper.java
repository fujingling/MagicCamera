package com.seu.magiccamera.common.utils;

import com.seu.magiccamera.R;
import com.seu.magicfilter.filter.helper.MagicFilterType;


public class FilterTypeHelper {
	
	public static int FilterType2Color(int filterType){
		switch (filterType) {
			case MagicFilterType.NONE:
				return R.color.filter_color_grey_light;
			case MagicFilterType.WHITECAT:
			case MagicFilterType.BLACKCAT:
			case MagicFilterType.SUNRISE:
			case MagicFilterType.SUNSET:
				return R.color.filter_color_brown_light;
			case MagicFilterType.COOL:
				return R.color.filter_color_blue_dark;
			case MagicFilterType.EMERALD:
			case MagicFilterType.EVERGREEN:
				return R.color.filter_color_blue_dark_dark;
			case MagicFilterType.FAIRYTALE:
				return R.color.filter_color_blue;
			case MagicFilterType.ROMANCE:
			case MagicFilterType.SAKURA:
			case MagicFilterType.WARM:
				return R.color.filter_color_pink;
			case MagicFilterType.AMARO:
			case MagicFilterType.BRANNAN:
			case MagicFilterType.BROOKLYN:
			case MagicFilterType.EARLYBIRD:
			case MagicFilterType.FREUD:
			case MagicFilterType.HEFE:
			case MagicFilterType.HUDSON:
			case MagicFilterType.INKWELL:
			case MagicFilterType.KEVIN:
			case MagicFilterType.LOMO:
			case MagicFilterType.N1977:
			case MagicFilterType.NASHVILLE:
			case MagicFilterType.PIXAR:
			case MagicFilterType.RISE:
			case MagicFilterType.SIERRA:
			case MagicFilterType.SUTRO:
			case MagicFilterType.TOASTER2:
			case MagicFilterType.VALENCIA:
			case MagicFilterType.WALDEN:
			case MagicFilterType.XPROII:
				return R.color.filter_color_brown_dark;
			case MagicFilterType.ANTIQUE:
			case MagicFilterType.NOSTALGIA:
				return R.color.filter_color_green_dark;
			case MagicFilterType.BEAUTY:
			case MagicFilterType.SKINWHITEN:
			case MagicFilterType.HEALTHY:
				return R.color.filter_color_red;
			case MagicFilterType.SWEETS:
				return R.color.filter_color_red_dark;
			case MagicFilterType.CALM:
			case MagicFilterType.LATTE:
			case MagicFilterType.TENDER:
				return R.color.filter_color_brown;
			default:
				return R.color.filter_color_grey_light;
		}
	}
	
	public static int FilterType2Thumb(int filterType){
		switch (filterType) {
		case MagicFilterType.NONE:
			return R.drawable.filter_thumb_original;
		case MagicFilterType.WHITECAT:
			return R.drawable.filter_thumb_whitecat;
		case MagicFilterType.BLACKCAT:
			return R.drawable.filter_thumb_blackcat;
		case MagicFilterType.ROMANCE:
			return R.drawable.filter_thumb_romance;
		case MagicFilterType.SAKURA:
			return R.drawable.filter_thumb_sakura;
		case MagicFilterType.AMARO:
			return R.drawable.filter_thumb_amoro;
		case MagicFilterType.BRANNAN:
			return R.drawable.filter_thumb_brannan;
		case MagicFilterType.BROOKLYN:
			return R.drawable.filter_thumb_brooklyn;
		case MagicFilterType.EARLYBIRD:
			return R.drawable.filter_thumb_earlybird;
		case MagicFilterType.FREUD:
			return R.drawable.filter_thumb_freud;
		case MagicFilterType.HEFE:
			return R.drawable.filter_thumb_hefe;
		case MagicFilterType.HUDSON:
			return R.drawable.filter_thumb_hudson;
		case MagicFilterType.INKWELL:
			return R.drawable.filter_thumb_inkwell;
		case MagicFilterType.KEVIN:
			return R.drawable.filter_thumb_kevin;
		case MagicFilterType.LOMO:
			return R.drawable.filter_thumb_lomo;
		case MagicFilterType.N1977:
			return R.drawable.filter_thumb_1977;
		case MagicFilterType.NASHVILLE:
			return R.drawable.filter_thumb_nashville;
		case MagicFilterType.PIXAR:
			return R.drawable.filter_thumb_piaxr;
		case MagicFilterType.RISE:
			return R.drawable.filter_thumb_rise;
		case MagicFilterType.SIERRA:
			return R.drawable.filter_thumb_sierra;
		case MagicFilterType.SUTRO:
			return R.drawable.filter_thumb_sutro;
		case MagicFilterType.TOASTER2:
			return R.drawable.filter_thumb_toastero;
		case MagicFilterType.VALENCIA:
			return R.drawable.filter_thumb_valencia;
		case MagicFilterType.WALDEN:
			return R.drawable.filter_thumb_walden;
		case MagicFilterType.XPROII:
			return R.drawable.filter_thumb_xpro;
		case MagicFilterType.ANTIQUE:
			return R.drawable.filter_thumb_antique;
		case MagicFilterType.BEAUTY:
		case MagicFilterType.SKINWHITEN:
			return R.drawable.filter_thumb_beauty;
		case MagicFilterType.CALM:
			return R.drawable.filter_thumb_calm;
		case MagicFilterType.COOL:
			return R.drawable.filter_thumb_cool;
		case MagicFilterType.EMERALD:
			return R.drawable.filter_thumb_emerald;
		case MagicFilterType.EVERGREEN:
			return R.drawable.filter_thumb_evergreen;
		case MagicFilterType.FAIRYTALE:
			return R.drawable.filter_thumb_fairytale;
		case MagicFilterType.HEALTHY:
			return R.drawable.filter_thumb_healthy;
		case MagicFilterType.NOSTALGIA:
			return R.drawable.filter_thumb_nostalgia;
		case MagicFilterType.TENDER:
			return R.drawable.filter_thumb_tender;
		case MagicFilterType.SWEETS:
			return R.drawable.filter_thumb_sweets;
		case MagicFilterType.LATTE:
			return R.drawable.filter_thumb_latte;
		case MagicFilterType.WARM:
			return R.drawable.filter_thumb_warm;
		case MagicFilterType.SUNRISE:
			return R.drawable.filter_thumb_sunrise;
		case MagicFilterType.SUNSET:
			return R.drawable.filter_thumb_sunset;
		case MagicFilterType.CRAYON:
			return R.drawable.filter_thumb_crayon;
		case MagicFilterType.SKETCH:
			return R.drawable.filter_thumb_sketch;
		default:
			return R.drawable.filter_thumb_original;
		}
	}
	
	public static int FilterType2Name(int filterType){
		switch (filterType) {
		case MagicFilterType.NONE:
			return R.string.filter_none;
		case MagicFilterType.WHITECAT:
			return R.string.filter_whitecat;
		case MagicFilterType.BLACKCAT:
			return R.string.filter_blackcat;
		case MagicFilterType.ROMANCE:
			return R.string.filter_romance;
		case MagicFilterType.SAKURA:
			return R.string.filter_sakura;
		case MagicFilterType.AMARO:
			return R.string.filter_amaro;
		case MagicFilterType.BRANNAN:
			return R.string.filter_brannan;
		case MagicFilterType.BROOKLYN:
			return R.string.filter_brooklyn;
		case MagicFilterType.EARLYBIRD:
			return R.string.filter_Earlybird;
		case MagicFilterType.FREUD:
			return R.string.filter_freud;
		case MagicFilterType.HEFE:
			return R.string.filter_hefe;
		case MagicFilterType.HUDSON:
			return R.string.filter_hudson;
		case MagicFilterType.INKWELL:
			return R.string.filter_inkwell;
		case MagicFilterType.KEVIN:
			return R.string.filter_kevin;
		case MagicFilterType.LOMO:
			return R.string.filter_lomo;
		case MagicFilterType.N1977:
			return R.string.filter_n1977;
		case MagicFilterType.NASHVILLE:
			return R.string.filter_nashville;
		case MagicFilterType.PIXAR:
			return R.string.filter_pixar;
		case MagicFilterType.RISE:
			return R.string.filter_rise;
		case MagicFilterType.SIERRA:
			return R.string.filter_sierra;
		case MagicFilterType.SUTRO:
			return R.string.filter_sutro;
		case MagicFilterType.TOASTER2:
			return R.string.filter_toastero;
		case MagicFilterType.VALENCIA:
			return R.string.filter_valencia;
		case MagicFilterType.WALDEN:
			return R.string.filter_walden;
		case MagicFilterType.XPROII:
			return R.string.filter_xproii;
		case MagicFilterType.ANTIQUE:
			return R.string.filter_antique;
		case MagicFilterType.BEAUTY:
			return R.string.filter_beauty;
		case MagicFilterType.CALM:
			return R.string.filter_calm;
		case MagicFilterType.COOL:
			return R.string.filter_cool;
		case MagicFilterType.EMERALD:
			return R.string.filter_emerald;
		case MagicFilterType.EVERGREEN:
			return R.string.filter_evergreen;
		case MagicFilterType.FAIRYTALE:
			return R.string.filter_fairytale;
		case MagicFilterType.HEALTHY:
			return R.string.filter_healthy;
		case MagicFilterType.NOSTALGIA:
			return R.string.filter_nostalgia;
		case MagicFilterType.TENDER:
			return R.string.filter_tender;
		case MagicFilterType.SWEETS:
			return R.string.filter_sweets;
		case MagicFilterType.LATTE:
			return R.string.filter_latte;
		case MagicFilterType.WARM:
			return R.string.filter_warm;
		case MagicFilterType.SUNRISE:
			return R.string.filter_sunrise;
		case MagicFilterType.SUNSET:
			return R.string.filter_sunset;
		case MagicFilterType.SKINWHITEN:
			return R.string.filter_skinwhiten;
		case MagicFilterType.CRAYON:
			return R.string.filter_crayon;
		case MagicFilterType.SKETCH:
			return R.string.filter_sketch;
		default:
			return R.string.filter_none;
		}
	}
}
