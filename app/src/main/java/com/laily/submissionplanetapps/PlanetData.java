package com.laily.submissionplanetapps;

import com.laily.myapplication.R;

import java.util.ArrayList;

public class PlanetData {
    private static String[] planetName = {
            "Jupiter",
            "Mars",
            "Mercury",
            "Moon",
            "Neptune",
            "Pluto",
            "Saturn",
            "Sun",
            "Earth",
            "Uranus",
            "Venus"
    };
    private static String[] jarak = {
            "778,3 juta KM",
            "108  juta KM",
            "57,9 juta KM",
            "148 juta KM",
            "4.497 juta KM",
            "5,9 miliar km",
            "1.427,0 juta KM",
            " 0",
            "149,6 juta KM",
            "149,6 juta KM",
            "108,2 juta KM"
    };

    private static String[] deskripsi = {
            "Jupiter is more than twice as massive than the other planets of our solar system combined. The giant planet's Great Red spot is a centuries-old storm bigger than Earth.",
            "Mars is a dusty, cold, desert world with a very thin atmosphere. There is strong evidence Mars was—billions of years ago—wetter and warmer, with a thicker atmosphere.",
            "Mercury—the smallest planet in our solar system and closest to the Sun—is only slightly larger than Earth's Moon. Mercury is the fastest planet, zipping around the Sun every 88 Earth days.",
            "Moons – also known as natural satellites – orbit planets and asteroids in our solar system. Earth has one moon, and there are more than 200 moons in our solar system. Most of the major planets – all except Mercury and Venus – have moons. Pluto and some other dwarf planets, as well as many asteroids, also have small moons. Saturn and Jupiter have the most moons, with dozens orbiting each of the two giant planets.",
            "Neptune—the eighth and most distant major planet orbiting our Sun—is dark, cold and whipped by supersonic winds. It was the first planet located through mathematical calculations.",
            "Pluto is a complex world of ice mountains and frozen plains. Once considered the ninth planet, Pluto is the best known of a new class of worlds called dwarf planets.",
            "Adorned with a dazzling, complex system of icy rings, Saturn is unique in our solar system. The other giant planets have rings, but none are as spectacular as Saturn's.",
            "The Sun is the largest object within our solar system, comprising 99.8% of the system's mass. The Sun is located at the center of our solar system, and Earth orbits 93 million miles away from it. Though massive, the Sun still isn't as large as other types of stars. It's classified as a yellow dwarf star.",
            "Earth—our home planet—is the only place we know of so far that’s inhabited by living things. It's also the only planet in our solar system with liquid water on the surface.",
            "Adorned with a dazzling, complex system of icy rings, Saturn is unique in our solar system. The other giant planets have rings, but none are as spectacular as Saturn's.",
            "Venus spins slowly in the opposite direction from most planets. A thick atmosphere traps heat in a runaway greenhouse effect, making it the hottest planet in our solar system."
    };
    private static int[] images = {

            R.drawable.jupiter,
            R.drawable.mars,
            R.drawable.merkurius,
            R.drawable.moon,
            R.drawable.neptune,
            R.drawable.pluto,
            R.drawable.saturnus,
            R.drawable.sun,
            R.drawable.earth,
            R.drawable.uranus,
            R.drawable.venus,
    };
    static ArrayList<Planet> getListData() {
        ArrayList<Planet> list = new ArrayList<>();
        for (int position = 0; position < planetName.length; position++) {
            Planet planet = new Planet();
            planet.setName(planetName[position]);
            planet.setJarak(jarak[position]);
            planet.setDetail(deskripsi[position]);
            planet.setImages(images[position]);
            list.add(planet);
        }
        return list;
    }
}
