function calculate() {
  let km = document.getElementById("dailyKm").value;
  let petrolPrice = document.getElementById("petrolPrice").value;
  let evCost = document.getElementById("evCost").value;
  let mileage = document.getElementById("mileage").value;

  if (!km || !petrolPrice || !evCost || !mileage) {
    alert("Please fill all fields");
    return;
  }

  // Petrol cost per day
  let petrolPerDay = (km / mileage) * petrolPrice;

  // EV cost per day (assuming 1 kWh = 6 km)
  let evPerDay = (km / 6) * evCost;

  let monthlyPetrol = petrolPerDay * 30;
  let monthlyEV = evPerDay * 30;

  let savings = monthlyPetrol - monthlyEV;

  document.getElementById("petrolCost").innerText =
    "Petrol Monthly Cost: ₹" + monthlyPetrol.toFixed(2);

  document.getElementById("evRunningCost").innerText =
    "EV Monthly Cost: ₹" + monthlyEV.toFixed(2);

  document.getElementById("savings").innerText =
    "💰 You Save: ₹" + savings.toFixed(2) + " per month";
}
