// Function to get the appropriate greeting based on the time of the day
function getGreeting() {
    const currentTime = new Date();
    const currentHour = currentTime.getHours();
  
    if (currentHour < 12) {
      return "Good morning";
    } else if (currentHour < 18) {
      return "Good afternoon";
    } else {
      return "Good evening";
    }
  }
  
  // Function to set the greeting based on the user's name
  function setGreeting(name) {
    const greetingElement = document.getElementById("greeting");
    greetingElement.textContent = `${getGreeting()} ${name}, welcome to the Student Survey Form`;
  }
  
  // Function to handle form submission
  function handleSubmit(event) {
    event.preventDefault();
    const nameInput = document.getElementById("name");
    const name = nameInput.value.trim();
  
    if (name !== "") {
      setCookie("username", name, 7); // Set cookie with a 7-day expiration
      setGreeting(name);
      nameForm.style.display = "none";
    }
  }
  
  // Function to set a cookie
  function setCookie(name, value, days) {
    const expirationDate = new Date();
    expirationDate.setDate(expirationDate.getDate() + days);
  
    const cookie = `${encodeURIComponent(name)}=${encodeURIComponent(value)}; expires=${expirationDate.toUTCString()}; path=/`;
    document.cookie = cookie;
  }
  
  // Function to get the value of a cookie
  function getCookie(name) {
    const cookies = document.cookie.split(";");
  
    for (let i = 0; i < cookies.length; i++) {
      const cookie = cookies[i].trim();
  
      if (cookie.startsWith(`${name}=`)) {
        return decodeURIComponent(cookie.substring(name.length + 1));
      }
    }
  
    return null;
  }
  
  // Check if a cookie exists
  const username = getCookie("username");
  
  if (username !== null) {
    setGreeting(username);
  } else {
    const nameForm = document.getElementById("nameForm");
    nameForm.style.display = "block";
    nameForm.addEventListener("submit", handleSubmit);
  }

 